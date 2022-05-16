package demo_method_reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

@FunctionalInterface
interface IStudent {
    void display();
}

@FunctionalInterface
interface SayHello {
    Student sayHello(String message);
}

class Calculator {
    public static int multi(int a, int b) {
        return a * b;
    }
}

public class DemoMethodReference {
    public static void main(String[] args) {
        // Triển khai functional interface
        Student student = new Student(1, "Bùi Hiên", "hiengmail.com");
        IStudent iStudent = student::printInfo;
        iStudent.display();

        // Tham chiếu đến method của 1 instance
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Bùi Hiên", "hiengmail.com"));
        students.add(new Student(2, "Thu Hằng", "hanggmail.com"));
        students.add(new Student(3, "Phương Loan", "loangmail.com"));

        students.forEach(Student::printInfo);
        students.forEach(System.out::println);

        // Sắp xếp theo tên
        students.sort(Comparator.comparing(Student::getName));
        students.forEach(System.out::println);

        // Tham chiếu đến static method của class
        BiFunction<Integer, Integer, Integer> calculator = Calculator::multi;
        int pr = calculator.apply(11, 5);
        System.out.println("Kết quả = " + pr);

        // Sử dụng Functional interface build in
        Consumer<String> c = System.out::println;
        c.accept("Xin chào các bạn");

        // Sử dụng Functional interface build in
        List<Integer> list = Arrays.asList(12, 5, 45, 18, 33, 24, 40);
        List<Integer> result = findNumbers(list, DemoMethodReference::isOdd);
        result.forEach(System.out::println);

    }

    public static boolean isOdd(int number) {
        return number % 2 == 1;
    }

    public static List<Integer> findNumbers(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> newList = new ArrayList<>();
        for (Integer i : list) {
            if (predicate.test(i)) {
                newList.add(i);
            }
        }
        return newList;
    }
}
