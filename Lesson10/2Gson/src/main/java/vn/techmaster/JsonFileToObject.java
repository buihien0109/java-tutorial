package vn.techmaster;

import com.google.gson.Gson;
import vn.techmaster.model.Student;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class JsonFileToObject {
    public static void main(String[] args) throws IOException {
        // Lấy thông tin đối tượng student từ file "student.json"
        Student student = getObjectFromJsonFile("student.json");
        System.out.println(student);

        // Lấy mảng đối tượng student từ file "list-student.json"
        List<Student> students = getListObjectFromJsonFile("list-student.json");

        // Vì có thể list là null, nên xử lý bằng Optional
        Optional<List<Student>> studentsOptional = Optional.ofNullable(students);

        // In ra thông tin từng Object trong List
        if(studentsOptional.isPresent()) {
            students.forEach(System.out::println);
        }
    }

    public static Student getObjectFromJsonFile(String fileName) {
        try {
            Gson gson = new Gson();

            Reader reader = Files.newBufferedReader(Paths.get(fileName));

            // Object đơn
            Student student = gson.fromJson(reader, Student.class);

            reader.close();

            return student;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<Student> getListObjectFromJsonFile(String fileName) {
        try {
            Gson gson = new Gson();

            Reader reader = Files.newBufferedReader(Paths.get(fileName));

            // List Object
            List<Student> students = Arrays.asList(gson.fromJson(reader, Student[].class));

            reader.close();

            return students;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
