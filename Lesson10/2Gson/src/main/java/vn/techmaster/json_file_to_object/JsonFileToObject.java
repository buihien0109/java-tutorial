package vn.techmaster.json_file_to_object;

import com.google.gson.Gson;
import vn.techmaster.model.Student;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class JsonFileToObject {

    // 1. Lấy Object đơn từ file json
    public Student getObjectFromJsonFile(String fileName) {
        try {
            // Khởi tạo đối tượng gson
            Gson gson = new Gson();

            // Tạo đối tượng reader để đọc file
            Reader reader = Files.newBufferedReader(Paths.get(fileName));

            // Đọc thông tin từ file và binding và class
            Student student = gson.fromJson(reader, Student.class);

            // Đọc file xong thì đóng lại
            // Và trả về kết quả
            reader.close();
            return student;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    // 2. Lấy List object từ file json
    public List<Student> getListObjectFromJsonFile(String fileName) {
        try {
            // Khởi tạo đối tượng gson
            Gson gson = new Gson();

            // Tạo đối tượng reader để đọc file
            Reader reader = Files.newBufferedReader(Paths.get(fileName));

            // Đọc thông tin từ file và binding và class
            List<Student> students = Arrays.asList(gson.fromJson(reader, Student[].class));

            // Đọc file xong thì đóng lại
            // Và trả về kết quả
            reader.close();
            return students;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
