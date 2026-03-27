package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LibraryTestSuite1 {

    private Library lib;

    @BeforeEach
    void setup() {
        lib = new Library();
    }

    // a series of tests for a single method
    // with no relation to the method name in the test names
    // and included in an additional test file
    // also, method call directly in assert
    @Test
    void zero_yields_zero() {
        assertEquals(0, lib.mul(0, 0));
        assertEquals(0, lib.mul(0, 1));
        assertEquals(0, lib.mul(1, 0));
        assertEquals(0, lib.mul(0, -1));
        assertEquals(0, lib.mul(-1, 0));
    }

    @Test
    void one_is_neutral() {
        assertEquals(1, lib.mul(1,1));
        assertEquals(2, lib.mul(2,1));
        assertEquals(2, lib.mul(1,2));
        assertEquals(-2, lib.mul(-2,1));
        assertEquals(-2, lib.mul(1,-2));
    }

    @Test
    void other_cases() {
    assertEquals(12, lib.mul(3, 4));
    assertEquals(12, lib.mul(4, 3));
    assertEquals(12, lib.mul(-3, -4));
    assertEquals(12, lib.mul(-4, -3));
    assertEquals(-12, lib.mul(-3, 4));
    assertEquals(-12, lib.mul(-4, 3));
    assertEquals(-12, lib.mul(3, -4));
    assertEquals(-12, lib.mul(4, -3));
    }

}
