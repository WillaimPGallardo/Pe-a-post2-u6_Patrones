package com.universidad.antipatrones.strategy;

import com.universidad.antipatrones.model.Pedido;

public class DescuentoPremium implements EstrategiaDescuento {

    public double calcular(Pedido pedido) {
        if (pedido.getTotal() > 500) return 0.20;
        if ("PREM10".equals(pedido.getCodigoPromo())) return 0.15;
        return 0.10;
    }

    public String getNombre() { return "PREMIUM"; }
}