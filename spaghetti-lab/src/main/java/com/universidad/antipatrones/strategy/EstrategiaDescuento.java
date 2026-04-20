package com.universidad.antipatrones.strategy;

import com.universidad.antipatrones.model.Pedido;

public interface EstrategiaDescuento {
    double calcular(Pedido pedido);
    String getNombre();
}