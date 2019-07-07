package org.itstep;

import org.itstep.model.*;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        //circle.setRadius(22);

        Square square = new Square(6);
        //square.setSide(4.2);

        Triangle triangle = new Triangle(8,4);
        //triangle.setBase(12.8);
        //triangle.setHeight(10);

        System.out.println("Circle area is "+ circle.getArea());
        System.out.println("Square area is "+ square.getArea());
        System.out.println("Triangle area is "+ triangle.getArea());
//---------------------------------------------


    }
}
