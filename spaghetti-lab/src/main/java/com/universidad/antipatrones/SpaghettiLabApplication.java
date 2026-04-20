package com.universidad.antipatrones;

import com.universidad.antipatrones.command.*;
import com.universidad.antipatrones.model.Pedido;
import com.universidad.antipatrones.selector.SelectorEstrategia;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpaghettiLabApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpaghettiLabApplication.class, args);
    }

    @Override
    public void run(String... args) {

        SelectorEstrategia selector = new SelectorEstrategia();

        List<Pedido> pedidos = List.of(
                new Pedido("P001", "VIP", 1200.0, "VIPEXTRA"),
                new Pedido("P002", "VIP", 600.0, "VIP20"),
                new Pedido("P003", "PREMIUM", 300.0, "PREM10"),
                new Pedido("P004", "ESTANDAR", 150.0, "FIRST50"),
                new Pedido("P005", "ESTANDAR", 80.0, null)
        );

        pedidos.stream()
                .map(p -> new ComandoProcesarPedido(p,
                        selector.seleccionar(p.getTipoCliente())))
                .forEach(ComandoPedido::ejecutar);
    }
}