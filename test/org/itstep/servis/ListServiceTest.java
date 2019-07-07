package org.itstep.servis;

import org.itstep.model.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListServiceTest {

    @Test
    void getMaxShape() {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(8);

        Square square1 = new Square(4);
        Square square2 = new Square(10);

        Triangle triangle1 = new Triangle(6,8);
        Triangle triangle2 = new Triangle(3,8);

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(circle1);
        shapeList.add(circle2);
        shapeList.add(square1);
        shapeList.add(square2);
        shapeList.add(triangle1);
        shapeList.add(triangle2);

        assertNotNull(shapeList);

        Shape maxShape = ListService.getMaxShape(shapeList);

        assertNotNull(maxShape);
        assertEquals(maxShape.getArea(),201.06,0.01);
        assertEquals(maxShape.getClass().getSimpleName(),"Circle");

    }
    @Test
    void chekEmptyListForMaxShape(){
        Shape nullmaxShape = ListService.getMaxShape(new ArrayList<>());
        assertNull(nullmaxShape);
    }

    @Test
    void getMinShape() {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(8);

        Square square1 = new Square(4);
        Square square2 = new Square(10);

        Triangle triangle1 = new Triangle(6,8);
        Triangle triangle2 = new Triangle(3,8);

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(circle1);
        shapeList.add(circle2);
        shapeList.add(square1);
        shapeList.add(square2);
        shapeList.add(triangle1);
        shapeList.add(triangle2);

        assertNotNull(shapeList);

        Shape minShape = ListService.getMinShape(shapeList);

        assertNotNull(minShape);
        assertEquals(minShape.getArea(),12.0,0.01);
        assertEquals(minShape.getClass().getSimpleName(),"Triangle");

    }

    @Test
    void chekEmptyListForMinShape(){
        Shape nullminShape = ListService.getMaxShape(new ArrayList<>());
        assertNull(nullminShape);
    }
}