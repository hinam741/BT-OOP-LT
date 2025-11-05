package HW_ON_TAP_GK;

import java.util.*;

public class MainProgram {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle(new Point(1, 2), 4, 5, "red", true));
        shapes.add(new Square(new Point(3, 3), 2, "blue", false));
        shapes.add(new Circle(new Point(0, 0), 3, "green", true));

        // 1. Số hình
        System.out.println("Number of shapes: " + shapes.size());

        // 2. Chi tiết
        System.out.println("HW_ON_TAP_GK.Shape details:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        // 3. DS tâm điểm
        System.out.println("Center points:");
        for (Shape shape : shapes) {
            Point center = null;
            if (shape instanceof Rectangle) {
                center = ((Rectangle) shape).getCenterPoint();
            } else if (shape instanceof Square) {
                center = ((Square) shape).getCenterPoint();
            } else if (shape instanceof Circle) {
                center = ((Circle) shape).getCenterPoint();
            }
            if (center != null) {
                System.out.println(center);
            }
        }
    }
}

