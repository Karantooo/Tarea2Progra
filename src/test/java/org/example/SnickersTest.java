package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase para testear la clase Snickers
 * @author Carlos Álvarez
 */
class SnickersTest {

    private Snickers snicker;

    /**
     * Se crea el dulce con el que se va a hacer los test
     */
    @BeforeEach
    void setUp() {
        snicker = new Snickers(1);
    }

    /**
     * test para comprobar que la clase retorne snickers.
     */
    @Test
    @DisplayName("Test para consumir snickers")
    public void seConsumioSnickers(){
        assertEquals("snickers", snicker.consumir());
    }
}