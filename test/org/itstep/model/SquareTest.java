package org.itstep.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {

    @Test
    void getArea() {

        Square square = new Square(6);
        Assertions.assertEquals(36.0,square.getArea(),0.1);
    }
}