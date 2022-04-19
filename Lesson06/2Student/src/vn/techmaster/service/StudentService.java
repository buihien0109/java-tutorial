package vn.techmaster.service;

import vn.techmaster.model.Student;

import java.util.Scanner;

public class StudentService {

    // Tạo đối tượng student nhập vào từ bàn phím (constructor mặc định)
    public Student createStudent() {
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Nhập id : ");
        student.id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên : ");
        student.name = sc.nextLine();
        System.out.print("Nhập điểm lý thuyết : ");
        student.theoryPoint = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập điểm thực hành : ");
        student.practicePoint = Double.parseDouble(sc.nextLine());

        return student;
    }

    // Tạo đối tượng student nhập vào từ bàn phím (constructor có tham số)
    public Student createNewStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập id : ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên : ");
        String name = sc.nextLine();
        System.out.print("Nhập điểm lý thuyết : ");
        double theoryPoint = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập điểm thực hành : ");
        double practicePoint = Double.parseDouble(sc.nextLine());

        return new Student(id, name, theoryPoint, practicePoint);
    }

    // Tính toán điểm trung bình của đối tượng student
    public double avgPoint(Student student) {
        return (student.theoryPoint + student.practicePoint) / 2;
    }

    // In ra thông tin của đối tượng student
    public void showInfo(Student student) {
        System.out.println(student.id + " - " + student.name + " - " + student.theoryPoint
        + " - " + student.practicePoint + " - " + avgPoint(student));
    }
}
