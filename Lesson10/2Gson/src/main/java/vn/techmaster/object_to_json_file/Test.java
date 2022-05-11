package vn.techmaster.object_to_json_file;

import vn.techmaster.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng
        ObjectToJsonFile objectToJsonFile = new ObjectToJsonFile();

        // ********************************************

        // Khởi tạo Object student
        Student student = new Student(1, "Bùi Hiên", 25, "hien@techmaster.vn");

        // Ghi đối tượng student vào file "student.json"
        objectToJsonFile.convertObjectToJsonFile("student.json", student);

        // ********************************************

        // Khởi tạo danh sách student
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Nguyễn A", 30, "a@gmail.com"));
        students.add(new Student(2, "Ngô B", 31, "b@gmail.com"));
        students.add(new Student(3, "Trần C", 23, "c@gmail.com"));
        students.add(new Student(3, "Phan D", 26, "d@gmail.com"));

        // Ghi danh sách student vào file "list-student.json"
        objectToJsonFile.convertObjectToJsonFile("list-student.json", students);
    }
}
