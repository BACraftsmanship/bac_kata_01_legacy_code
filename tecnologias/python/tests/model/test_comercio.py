from unittest import TestCase

from bacraftmanship.model.comercio import Comercio


class ComercioTests(TestCase):
    def setUp(self):
        self.comercio = Comercio()

    def test_comerciante_compra_gaseosa_por_200_vende_por_350_la_ganancia_es_100(self):
        gaseosa = self.comprar("coca", 200, 1)
        renta = self.vender(gaseosa, 350)
        self.assertAlmostEqual(renta, 150, 2)

    def test_comerciante_compra_100_gaseosa_por_500_vende_por_100_la_ganancia_es_95(self):
        gaseosa = self.comprar("coca", 500, 100)
        renta = self.vender(gaseosa, 100)
        self.assertAlmostEqual(renta, 95, 2)

    def vender(self, gaseosa, precio_venta):
        return self.comercio.vender(gaseosa, precio_venta)

    def comprar(self, gaseosa, precio_compra, cantidad):
        return self.comercio.compra(gaseosa, precio_compra, cantidad)
