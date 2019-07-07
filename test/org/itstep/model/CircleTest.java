package org.itstep.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CircleTest {

    @Test
    void getArea() {

        Circle circle = new Circle(5);
        Assertions.assertEquals(78.53,circle.getArea(),0.01);
    }
}