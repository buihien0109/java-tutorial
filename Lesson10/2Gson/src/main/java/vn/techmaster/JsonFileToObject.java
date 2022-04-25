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
        Student student = getObjectFromJsonFile("student.json");
        System.out.println(student);

        List<Student> students = getListObjectFromJsonFile("list-student.json");

        Optional<List<Student>> studentsOptional = Optional.ofNullable(students);
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
