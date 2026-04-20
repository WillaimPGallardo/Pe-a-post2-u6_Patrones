package com.universidad.antipatrones.strategy;

import com.universidad.antipatrones.model.Pedido;

public class DescuentoVIP implements EstrategiaDescuento {

    public double calcular(Pedido pedido) {

        double base = pedido.getTotal() > 1000 ? 0.35 :
                      pedido.getTotal() > 500 ? 0.25 : 0.15;

        String promo = pedido.getCodigoPromo();

        if ("VIPEXTRA".equals(promo) && pedido.getTotal() > 1000)
            return 0.45;

        if (promo != null && promo.startsWith("VIP") && pedido.getTotal() > 500)
            return base + 0.05;

        return base;
    }

    public String getNombre() { return "VIP"; }
}