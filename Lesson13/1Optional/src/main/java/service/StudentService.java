package service;

import exception.NotFoundException;
import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentService {
    // Tạo danh sách student để quản lý
    private final List<Student> students;

    public StudentService() {
        // Khởi tạo 1 số student và thêm vào danh sách
        students = new ArrayList<>();
        students.add(new Student(1, "Hiên", "hien@gmail.com"));
        students.add(new Student(2, "An", "an@gmail.com"));
        students.add(new Student(3, "Công", "cong@gmail.com"));
    }

    // In ra danh sách student
    public void printStudents() {
        if(students.isEmpty()) {
            throw new NotFoundException("List student is empty");
        }
        students.forEach(System.out::println);
    }

    // Tìm kiếm student theo id
    public Student getUserById(int id) {
        Optional<Student> optionalStudent = findStudent(id);
        if (optionalStudent.isPresent()) {
            return optionalStudent.get();
        }
        throw new NotFoundException("Can't find student with id = " + id);
    }

    // Xóa student theo id
    public void deleteStudent(int id) {
        if (findStudent(id).isEmpty()) {
            throw new NotFoundException("Can't find student with id = " + id);
        }
        students.removeIf(s -> s.getId() == id);
    }

    // Tìm kiếm student theo email
    public Student getUserByEmail(String email) {
        Optional<Student> optionalStudent = findStudent(email);
        return optionalStudent.orElseThrow(() -> {
            throw new NotFoundException("Can't find student with email = " + email);
        });
    }

    // HELPER METHOD : Tìm kiếm student theo id --> return Optional
    public Optional<Student> findStudent(int id) {
        return students.stream().filter(s -> s.getId() == id).findFirst();
    }

    // HELPER METHOD : Tìm kiếm student theo email --> return Optional
    public Optional<Student> findStudent(String email) {
        return students.stream().filter(s -> s.getEmail().equals(email)).findFirst();
    }
}
