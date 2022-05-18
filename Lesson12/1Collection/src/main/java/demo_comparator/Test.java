package demo_comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "An", 24));
        students.add(new Student(2, "Hiên", 25));
        students.add(new Student(3, "Ngọc", 18));
        students.add(new Student(4, "Mẫn", 26));

        // Sắp xếp theo tên giảm dần
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.getName().compareTo(s1.getName());
            }
        });

        System.out.println("Sắp xếp học viên theo tên giảm dần");
        students.forEach(System.out::println);

        // Sắp xếp theo tên tăng dần
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });

        System.out.println("\nSắp xếp học viên theo tên tăng dần");
        students.forEach(System.out::println);

        // Sắp xếp theo tuổi giảm dần
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.getAge() - s1.getAge();
            }
        });

        System.out.println("\nSắp xếp học viên theo tuổi giảm dần");
        students.forEach(System.out::println);

        // Sắp xếp theo tuổi tăng dần
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getAge() - s2.getAge();
            }
        });

        System.out.println("\nSắp xếp học viên theo tuổi tăng dần");
        students.forEach(System.out::println);
    }
}
