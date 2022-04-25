package vn.techmaster;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonWriter;
import vn.techmaster.model.Student;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectToJsonFile {
    public static void main(String[] args) {
        // Khởi tạo Object student
        Student student = new Student(1, "Bùi Hiên", 25, "hien@techmaster.vn");
        convertObjectToJsonFile("student.json", student);

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Nguyễn A", 30, "a@gmail.com"));
        students.add(new Student(2, "Ngô B", 31, "b@gmail.com"));
        students.add(new Student(3, "Trần C", 23, "c@gmail.com"));
        students.add(new Student(3, "Phan D", 26, "d@gmail.com"));

        convertObjectToJsonFile("list-student.json", students);
    }

    public static void convertObjectToJsonFile(String fileName, Object obj) {
        try {
            // Gson gson = new Gson();

            // Nếu muốn format JSON cho đẹp
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            // Convert Object to JSON
            Writer writer = Files.newBufferedWriter(Paths.get(fileName));
            gson.toJson(obj, writer);

            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
