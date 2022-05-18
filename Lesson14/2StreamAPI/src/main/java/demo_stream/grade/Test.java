package demo_stream.grade;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // Khởi tạo đối tượng StudentService
        StudentService studentService = new StudentService();

        // Khởi tạo danh sách học viên
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 8, Gender.MALE));
        students.add(new Student("Sarah", 12, Gender.FEMALE));
        students.add(new Student("Bob", 16, Gender.MALE));
        students.add(new Student("Johnny", 2, Gender.MALE));
        students.add(new Student("Ethan", 4, Gender.MALE));
        students.add(new Student("Paula", 18, Gender.FEMALE));
        students.add(new Student("Donald", 5, Gender.MALE));
        students.add(new Student("Jennifer", 13, Gender.FEMALE));
        students.add(new Student("Courtney", 15, Gender.FEMALE));
        students.add(new Student("Jane", 9, Gender.FEMALE));

        // 1. Viết function tính thứ hạng trung bình của cả lớp
        System.out.println("\nThứ hạng trung bình cả lớp : " + studentService.getAvgAllStudent(students));

        // 2. Viết function tính thứ hạng trung bình của nam trong lớp
        System.out.println("\nThứ hạng trung bình nam : " + studentService.getAvgStudentMale(students));

        // 3. Viết function tính thứ hạng trung bình của Nữ trong lớp
        System.out.println("\nThứ hạng trung bình nữ : " + studentService.getAvgStudentFemale(students));

        // 4. Viết function tìm học viên Nam có thứ hạng cao nhất trong lớp
        System.out.println("\nHọc viên Nam có thứ hạng cao nhất trong lớp");
        studentService.print(studentService.findMaxGradeMale(students));

        // 5. Viết function tìm học viên Nữ có thứ hạng cao nhất trong lớp
        System.out.println("\nHọc viên Nữ có thứ hạng cao nhất trong lớp");
        studentService.print(studentService.findMaxGradeFemale(students));

        // 6. Viết function tìm học viên Nam có thứ hạng thấp nhất trong lớp
        System.out.println("\nHọc viên Nam có thứ hạng thấp nhất trong lớp");
        studentService.print(studentService.findMinGradeMale(students));

        // 7. Viết function tìm học viên Nữ có thứ hạng thấp nhất trong lớp
        System.out.println("\nHọc viên Nữ có thứ hạng thấp nhất trong lớp");
        studentService.print(studentService.findMinGradeFemale(students));

        // 8. Viết function thứ hạng cao nhất của cả lớp
        System.out.println("\nThứ hạng cao nhất cả lớp : " + studentService.findMaxGradeOfClass(students));

        // 9. Viết function thứ hạng thấp nhất của cả lớp
        System.out.println("\nThứ hạng thấp nhất cả lớp : " + studentService.findMinGradeOfClass(students));

        // 10. Viết function lấy ra danh sách tất cả học viên Nữ trong lớp
        System.out.println("\nDanh sách học viên nữ trong lớp");
        studentService.print(studentService.getStudentFemale(students));

        // 11. Viết function sắp xếp tên học viên theo chiều tăng dần của bảng chữ cái
        System.out.println("\nSắp xếp tên học viên theo chiều tăng dần của bảng chữ cái");
        studentService.print(studentService.sortByNameAsc(students));

        // 12. Viết function sắp xếp thứ hạng học viên theo chiều giảm dần
        System.out.println("\nSắp xếp thứ hạng học viên theo chiều giảm dần");
        studentService.print(studentService.sortByGradeDesc(students));

        // 13. Viết function lấy ra học viên Nữ có tên bắt đầu bằng "J"
        System.out.println("\nDanh sách học viên Nữ có tên bắt đầu bằng \"J\"");
        studentService.print(studentService.findStudentFemaleStartJ(students));

        // 14. Viết function lấy ra top 5 người có thứ hạng cao nhất trong lớp
        System.out.println("\nDanh sách top 5 học viên có thứ hạng cao nhất trong lớp");
        studentService.print(studentService.findStudentTop5(students));
    }
}


