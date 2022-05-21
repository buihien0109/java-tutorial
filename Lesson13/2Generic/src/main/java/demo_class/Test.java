package demo_class;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng với kiểu Integer
        MyClass<Integer> myClass = new MyClass<>(10);
        System.out.println(myClass.getObj());

        // Tạo đối tượng với kiểu String
        MyClass<String> myClass1 = new MyClass<>("Hello");
        System.out.println(myClass1.getObj());

        // Tạo đối tượng với kiểu Student
        MyClass<Student> myClass2 = new MyClass<>(new Student(1, "Bùi Hiên", "hien@techmaster.vn"));
        System.out.println(myClass2.getObj());

        // Gọi method
        myClass.demoMethod(10);
        myClass1.demoMethod("Hi");
        myClass2.demoMethod(new Student(2, "Thu Hằng", "hang@gmail.com"));

        // Gọi method với tham số kiểu Number
        myClass.demoMethod1(10);
        myClass.demoMethod1(10.5);
        myClass.demoMethod1(20L);
        myClass.demoMethod1(5.3f);
    }
}
