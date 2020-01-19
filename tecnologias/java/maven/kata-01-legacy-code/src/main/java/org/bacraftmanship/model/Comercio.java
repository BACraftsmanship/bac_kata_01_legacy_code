package org.bacraftmanship.model;

public class Comercio {

    private String producto;
    private double precioCompra;
    private int cantidad;

    public String compra(String producto, double precioCompra, int cantidad) {

        this.producto = producto;
        this.precioCompra = precioCompra;
        this.cantidad = cantidad;

        return producto;
    }

    public Double vender(String producto, double precioVenta) {

        if ( this.producto.equals(producto)) {
            return precioVenta - (precioCompra / cantidad);
        }

        return null;
    }
}
