package vn.techmaster.json_to_object;

import com.google.gson.Gson;
import vn.techmaster.model.Student;

public class JsonToObject {
    public static void main(String[] args) {
        // Tạo đối tượng gson
        Gson gson = new Gson();

        // Tạo chuỗi Json
        String studentJson = """
                {
                  "id": 1,
                  "name": "Bùi Hiên",
                  "age": 25,
                  "email": "hien@techmaster.vn"
                }""";

        // Binding chuỗi json vào class
        Student student = gson.fromJson(studentJson, Student.class);

        // In ra thông tin của đối tượng
        System.out.println(student);
    }
}
