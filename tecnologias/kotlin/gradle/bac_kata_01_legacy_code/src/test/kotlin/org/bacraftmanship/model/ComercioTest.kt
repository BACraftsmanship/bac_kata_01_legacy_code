package org.bacraftmanship.model

import org.assertj.core.api.Assertions
import org.assertj.core.data.Percentage
import org.junit.Before
import org.junit.Test

class ComercioTest {
    private var comercio: Comercio? = null

    @Before
    fun setup() {
        comercio = Comercio()
    }

    @Test
    fun comercianteCompraGaseosaPor200VendePor350LaGananciaEs100() {
        val gaseosa = comprar("coca", 200.0, 1)
        val renta = vender(gaseosa, 350.0)
        Assertions.assertThat(renta)
            .isCloseTo(150.0, Percentage.withPercentage(0.02))
    }

    @Test
    fun comercianteCompra100GaseosaPor500VendePor100LaGananciaEs95() {
        val gaseosa = comprar("coca", 500.0, 100)
        val renta = vender(gaseosa, 100.0)
        Assertions.assertThat(renta)
            .isCloseTo(95.0, Percentage.withPercentage(0.02))
    }

    private fun vender(gaseosa: String, precioVenta: Double): Double? {
        return comercio!!.vender(gaseosa, precioVenta)
    }

    private fun comprar(gaseosa: String, precioCompra: Double, cantidad: Int): String {
        return comercio!!.compra(gaseosa, precioCompra, cantidad)
    }
}