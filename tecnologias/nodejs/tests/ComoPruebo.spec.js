it.skip("test deshabilitado", () => {
  expect(false).toBeTruthy();
})

it("comprobar valores booleanos", () => {
  expect(true).toBeTruthy();
  expect("12".includes("12")).toBeTruthy();
  expect(1 == 1).toBeTruthy();
  expect(12 == 1).toBeFalsy();
})

it("comprobar excepciones", () => {

  expect(() => { throw new Error() }).toThrow(Error);
})