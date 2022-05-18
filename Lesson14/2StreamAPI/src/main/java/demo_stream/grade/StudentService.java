package demo_stream.grade;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentService {
    // HELPER METHOD **************************************
    // 1. In ra thông tin trong danh sách học viên
    public void print(List<Student> students) {
        students.stream().forEach(Student::printInfo);
    }

    // 2. Viết function tính thứ hạng trung bình của một danh sách học viên
    public double getAvgStudent(List<Student> students) {
        int total = students
                .stream()
                .mapToInt(Student::getGrade)
                .reduce(0, Integer::sum);

        return (double) total/students.size();
    }

    // 3. Tìm học viên theo giới tính
    public List<Student> findStudentByGender(List<Student> students, Gender gender) {
        return students
                .stream()
                .filter(student -> student.getGender() == gender)
                .collect(Collectors.toList());
    }

    public List<Student> findMaxGrade(List<Student> students) {
        return students
                .stream()
                .max((s1, s2) -> s1.getGrade() - s2.getGrade())
                .stream()
                .toList();
    }

    public List<Student> findMinGrade(List<Student> students) {
        return students
                .stream()
                .min((s1, s2) -> s1.getGrade() - s2.getGrade())
                .stream()
                .toList();
    }


    // MAIN METHOD **************************************
    // 1. Viết function tính thứ hạng trung bình của cả lớp
    public double getAvgAllStudent(List<Student> students) {
        return getAvgStudent(students);
    }

    // 2. Viết function tính thứ hạng trung bình của nam trong lớp
    public double getAvgStudentMale(List<Student> students) {
        List<Student> studentsMale = findStudentByGender(students, Gender.MALE);
        return getAvgStudent(studentsMale);
    }

    // 3. Viết function tính thứ hạng trung bình của Nữ trong lớp
    public double getAvgStudentFemale(List<Student> students) {
        List<Student> studentsMale = findStudentByGender(students, Gender.FEMALE);
        return getAvgStudent(studentsMale);
    }

    // 4. Viết function tìm học viên Nam có thứ hạng cao nhất trong lớp
    public List<Student> findMaxGradeMale(List<Student> students) {
        return findMaxGrade(findStudentByGender(students, Gender.MALE));
    }

    // 5. Viết function tìm học viên Nữ có thứ hạng cao nhất trong lớp
    public List<Student> findMaxGradeFemale(List<Student> students) {
        return findMaxGrade(findStudentByGender(students, Gender.FEMALE));
    }

    // 6. Viết function tìm học viên Nam có thứ hạng thấp nhất trong lớp
    public List<Student> findMinGradeMale(List<Student> students) {
        return findMinGrade(findStudentByGender(students, Gender.MALE));
    }

    // 7. Viết function tìm học viên Nữ có thứ hạng thấp nhất trong lớp
    public List<Student> findMinGradeFemale(List<Student> students) {
        return findMinGrade(findStudentByGender(students, Gender.FEMALE));
    }
    // 8. Viết function thứ hạng cao nhất của cả lớp
    public int findMaxGradeOfClass(List<Student> students) {
        return findMaxGrade(students).get(0).getGrade();
    }

    // 9. Viết function thứ hạng thấp nhất của cả lớp
    public int findMinGradeOfClass(List<Student> students) {
        return findMinGrade(students).get(0).getGrade();
    }

    // 10. Viết function lấy ra danh sách tất cả học viên Nữ trong lớp
    public List<Student> getStudentFemale(List<Student> students) {
        return findStudentByGender(students, Gender.FEMALE);
    }

    // 11. Viết function sắp xếp tên học viên theo chiều tăng dần của bảng chữ cái
    public List<Student> sortByNameAsc(List<Student> students) {
        return students
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    // 12. Viết function sắp xếp thứ hạng học viên theo chiều giảm dần
    public List<Student> sortByGradeDesc(List<Student> students) {
        return students
                .stream()
                .sorted(Comparator.comparing(Student::getGrade).reversed())
                .collect(Collectors.toList());
    }

    // 13. Viết function lấy ra học viên Nữ có tên bắt đầu bằng "J"
    public List<Student> findStudentFemaleStartJ(List<Student> students) {
        return students
                .stream()
                .filter(s -> s.getName().startsWith("J"))
                .collect(Collectors.toList());
    }

    // 14. Viết function lấy ra top 5 người có thứ hạng cao nhất trong lớp
    public List<Student> findStudentTop5(List<Student> students) {
        return students
                .stream()
                .sorted(Comparator.comparing(Student::getGrade).reversed())
                .limit(5)
                .collect(Collectors.toList());
    }
}
