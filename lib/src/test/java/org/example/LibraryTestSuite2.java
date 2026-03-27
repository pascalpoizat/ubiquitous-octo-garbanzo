package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestSuite2 {
  
    private Library lib;

    @BeforeEach
    void setup() {
        lib = new Library();
    }

    @Test
    void test1() {
        assertEquals(0, lib.sum(List.of()));
    }

    @Test
    void test2() {
        assertEquals(6, lib.sum(List.of(1,2,3)));
    }

}
