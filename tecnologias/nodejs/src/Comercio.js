class Comercio {

  compra(producto, precioCompra, cantidad) {
    this.producto = producto;
    this.precioCompra = precioCompra;
    this.cantidad = cantidad;

    return producto;
  }

  vender(producto, precioVenta) {
    if (this.producto.includes(producto)) {
      return precioVenta - (this.precioCompra / this.cantidad);
    }

    return null;
  }
}

module.exports = Comercio;