package org.itstep.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    void getArea() {

        Triangle triangle = new Triangle(8,4);
        Assertions.assertEquals(16,triangle.getArea());
    }
}