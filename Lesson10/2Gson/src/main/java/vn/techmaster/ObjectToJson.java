package vn.techmaster;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import vn.techmaster.model.Student;

public class ObjectToJson {
    public static void main(String[] args) {
        // Gson gson = new Gson();

        // Nếu muốn format JSON cho đẹp
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Khởi tạo Object student
        Student student = new Student(1, "Bùi Hiên", 25, "hien@techmaster.vn");

        // Convert Object to JSON
        String studentJson = gson.toJson(student);
        System.out.println(studentJson);
    }
}
