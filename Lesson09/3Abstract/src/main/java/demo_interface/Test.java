package demo_interface;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // Không thể khởi tạo đối tượng trực tiếp từ interface
        // Mà có thể khởi tạo interface bằng các class implements interface đó

        // Khởi tạo interface bằng class Rectangle
        IShape shape = new Rectangle(4, 5);

        // Gọi các phương thức đã được implements
        shape.printInfo();
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());

        // Gọi phương thức default của interface
        shape.getSide();

        System.out.println("*********************************");

        // Khởi tạo interface bằng class Triangle
        IShape shape1 = new Triangle(3, 4, 5);
        shape1.printInfo();
        System.out.println(shape1.getArea());
        System.out.println(shape1.getPerimeter());
        shape1.getSide();

        System.out.println("*********************************");

        // Khởi tạo 1 list shape
        List<IShape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(4, 5));
        shapes.add(new Rectangle(10, 5));
        shapes.add(new Triangle(3, 4, 5));
        shapes.add(new Triangle(4, 5, 6));

        for (IShape s: shapes) {
            s.printInfo();
            System.out.println(s.getArea());
            System.out.println(s.getPerimeter());
            System.out.println();
        }

        // Gọi phương thức static của interface IShape
        IShape.display();
    }
}
