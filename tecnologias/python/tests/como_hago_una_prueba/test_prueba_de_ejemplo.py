from unittest import TestCase


class PruebaDeEjemploTests(TestCase):
    def test_deshabilitado(self):
        self.skipTest("Example!")
        self.assertTrue(False)

    def test_comprobar_valores_booleanos(self):
        self.assertTrue(True)
        self.assertEqual("12", "12")
        self.assertEqual(1, 1)
        self.assertNotEqual(12, 1)

    def test_probar_exceptions(self):
        with self.assertRaises(RuntimeError):
            raise RuntimeError
