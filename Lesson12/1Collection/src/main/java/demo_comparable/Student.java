package demo_comparable;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
// Khi sử dụng Comparable thì class cần phải implements interface này
// Và overide method compareTo
// Chỉ có thể so sánh 1 tiêu chí
public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private int age;

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.getName()); // Sắp xếp theo tên giảm dần theo bảng chữ cái
    }
}
