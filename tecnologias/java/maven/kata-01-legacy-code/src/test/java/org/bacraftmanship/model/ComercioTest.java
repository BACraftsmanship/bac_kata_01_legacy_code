package org.bacraftmanship.model;

import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ComercioTest {

    private Comercio comercio;

    @BeforeEach
    public void setup() {
        comercio = new Comercio();
    }

    @Test
    public void comercianteCompraGaseosaPor200VendePor350LaGananciaEs100() {
        String gaseosa = comprar("coca", 200, 1);

        Double renta = vender(gaseosa, 350);

        assertThat(renta).isCloseTo(150, Percentage.withPercentage(0.02));
    }

    @Test
    public void comercianteCompra100GaseosaPor500VendePor100LaGananciaEs95() {
        String gaseosa = comprar("coca", 500, 100);

        Double renta = vender(gaseosa, 100);

        assertThat(renta).isCloseTo(95, Percentage.withPercentage(0.02));
    }

    private Double vender(String gaseosa, double precioVenta) {
        return comercio.vender(gaseosa, precioVenta);
    }

    private String comprar(String gaseosa, double precioCompra, int cantidad) {
        return comercio.compra(gaseosa, precioCompra, cantidad);
    }
}
