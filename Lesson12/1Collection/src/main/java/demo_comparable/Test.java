package demo_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "An", 24));
        students.add(new Student(2, "Hiên", 25));
        students.add(new Student(3, "Ngọc", 18));
        students.add(new Student(4, "Mẫn", 26));

        // Sắp xếp học viên theo tên tăng dần
        Collections.sort(students);

        // In ra thông tin học viên sau khi sắp xếp
        students.forEach(System.out::println);
    }
}
