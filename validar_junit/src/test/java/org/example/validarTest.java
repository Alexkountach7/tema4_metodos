package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class validarTest {

    @Test
    void sumar_3() {
        assertAll(

                ()->   assertEquals(15,validar.sumar_3(8,6,2));
                //()->   assertEquals(-12,validar.sumar_3(-8,-6,2));

        );
    }

    @Test
    void validar_positivo() {
        assertTrue(validar.validar_positivo(17));
        assertFalse(validar.validar_positivo(-9));
        assertTrue(validar.validar_positivo(0));
    }
}