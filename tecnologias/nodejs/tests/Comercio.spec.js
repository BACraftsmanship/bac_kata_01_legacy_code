const Comercio = require("../src/Comercio");

describe("ComercioTest", () => {

  let comercio;

  beforeEach(function setup() {
    comercio = new Comercio();
  })

  it("comerciante compra gaseosa por 200 vende por 350 la ganancia es 100", () => {
    const gaseosa = comprar("coca", 200, 1);
    const renta = vender(gaseosa, 350);
    expect(renta).toBeCloseTo(150, 0.02);
  })
  it("comerciante compra 100 gaseosa por 500 vende por 100 la ganancia es 95", () => {
    const gaseosa = comprar("coca", 500, 100);
    const renta = vender(gaseosa, 100);
    expect(renta).toBeCloseTo(95, 0.02);
  })
  
  function vender(gaseosa, precioVenta) {
    return comercio.vender(gaseosa, precioVenta);
  }
  function comprar(gaseosa, precioCompra, cantidad) {
    return comercio.compra(gaseosa, precioCompra, cantidad);
  }
})