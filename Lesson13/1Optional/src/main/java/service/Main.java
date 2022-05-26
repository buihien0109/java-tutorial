package service;

import exception.NotFoundException;
import model.Student;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo đối tượng StudentService
        StudentService studentService = new StudentService();

        // In ra thông tin của học viên
        System.out.println("In ra danh sách học viên");
        studentService.printStudents();

        // Tìm kiếm học viên theo id
        try {
            Student student = studentService.getUserById(1);
            System.out.println("\nTìm kiếm học viên có id = 1");
            System.out.println(student);

            Student student1 = studentService.getUserById(10);
            System.out.println("\nTìm kiếm học viên có id = 10");
            System.out.println(student1);
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Tìm kiếm học viên theo email
        try {
            Student student = studentService.getUserByEmail("hien@gmail.com");
            System.out.println("\nTìm kiếm học viên có email = hien@gmail.com");
            System.out.println(student);

            Student student1 = studentService.getUserByEmail("ngoc@gmail.com");
            System.out.println("\nTìm kiếm học viên có email = ngoc@gmail.com");
            System.out.println(student1);
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Xóa học viên theo id
        try {
            System.out.println("\nXóa học viên có id = 1");
            studentService.deleteStudent(1);

            System.out.println("\nDanh sách học viên sau khi xóa");
            studentService.printStudents();

            System.out.println("\nXóa học viên có id = 10");
            studentService.deleteStudent(10);
            System.out.println("\nDanh sách học viên sau khi xóa");
            studentService.printStudents();
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
