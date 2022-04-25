package vn.techmaster;

import com.google.gson.Gson;
import vn.techmaster.model.Student;

public class JsonToObject {
    public static void main(String[] args) {
        Gson gson = new Gson();

        String studentJson = """
                {
                  "id": 1,
                  "name": "Bùi Hiên",
                  "age": 25,
                  "email": "hien@techmaster.vn"
                }""";

        Student student = gson.fromJson(studentJson, Student.class);

        System.out.println(student);
    }
}
