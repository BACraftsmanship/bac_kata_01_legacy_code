package org.bacraftmanship.model

class Comercio {
    private var producto: String = ""
    private var precioCompra = 0.0
    private var cantidad = 0
    fun compra(producto: String, precioCompra: Double, cantidad: Int): String {
        this.producto = producto
        this.precioCompra = precioCompra
        this.cantidad = cantidad
        return producto
    }

    fun vender(producto: String, precioVenta: Double): Double {
        return if (this.producto == producto) {
            precioVenta - precioCompra / cantidad
        } else 0.0
    }
}