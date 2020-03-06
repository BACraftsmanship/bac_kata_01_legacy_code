class Comercio:
    def compra(self, producto, precio_compra, cantidad):
        self.producto = producto
        self.precio_compra = precio_compra
        self.cantidad = cantidad
        return producto

    def vender(self, producto, precio_venta):
        if self.producto == producto:
            return precio_venta - (self.precio_compra / self.cantidad)
        return None
