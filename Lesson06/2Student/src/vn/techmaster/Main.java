package vn.techmaster;

import vn.techmaster.model.Student;
import vn.techmaster.service.StudentService;

public class Main {

    public static void main(String[] args) {
        // Khởi tạo đối tượng student service
        StudentService studentService = new StudentService();

        // Gọi phương thức để nhập vào thông tin của đối tượng
        Student student = studentService.createNewStudent();

        // In ra thông tin của đối tượng vừa nhập
        studentService.showInfo(student);
    }
}
