package vn.techmaster.json_file_to_object;

import vn.techmaster.model.Student;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class Test {
    public static void main(String[] args) throws IOException {
        // Khởi tạo đối tượng
        JsonFileToObject jsonFileToObject = new JsonFileToObject();

        // Lấy thông tin đối tượng student từ file "student.json"
        Student student = jsonFileToObject.getObjectFromJsonFile("student.json");
        System.out.println("Đọc thông tin từ file student.json");
        System.out.println(student);
        System.out.println();

        // Lấy List đối tượng student từ file "list-student.json"
        List<Student> students = jsonFileToObject.getListObjectFromJsonFile("list-student.json");

        // Vì có thể list là null, nên xử lý bằng Optional
        Optional<List<Student>> studentsOptional = Optional.ofNullable(students);

        // In ra thông tin từng Object trong List
        System.out.println("Đọc thông tin từ file list-student.json");
        if(studentsOptional.isPresent()) {
            students.forEach(System.out::println);
        }
    }
}
