package org.bacraftmanship.comoHagoUnaPrueba

import org.assertj.core.api.Assertions
import org.junit.Test

/**
 * Unit test for simple App.
 */
class PruebaDeEjemplo {

    /*@Test
    #I hate junit5
    fun testDeshabilitado() {
        Assertions.assertThat(false).isTrue()
    }*/

    @Test
    fun comprobarValoresBooleanos() {
        Assertions.assertThat(true).isTrue()
        Assertions.assertThat("12" == "12").isTrue()
        Assertions.assertThat(1 == 1).isTrue()
        Assertions.assertThat(12 == 1).isFalse()
    }

    @Test
    fun probarExceptions() {
        Assertions.assertThatThrownBy { throw UnknownError() }.isInstanceOf(
            UnknownError::class.java
        )
    }
}