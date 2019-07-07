package org.itstep;

import org.itstep.model.Circle;
import org.itstep.model.Shape;
import org.itstep.model.Square;
import org.itstep.model.Triangle;
import org.itstep.servis.ListService;

import java.util.*;

public class CollectionRunner {
    public static void main(String[] args) {

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

        System.out.println("List has size "+ shapeList.size());
        Shape maxShape = ListService.getMaxShape(shapeList);
        Shape minShape = ListService.getMinShape(shapeList);
/*
        if (maxShape != null){
            System.out.println("MaxLargest area = "+maxShape.getArea()+
                    " the shape - "+maxShape.getClass().getSimpleName());
        }

        int i = 0;
        while (i<shapeList.size()){
            Shape element = shapeList.get(i);
            System.out.println(i+" box = "+element.getArea()+
                    " and Type "+element.getClass().getSimpleName());
            i++;
        }
*/
    }
}
