package vn.techmaster.overide_demo;

public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng student
        Student student = new Student();
        student.setName("Bùi Hiên");

        // Gọi đến method của lớp con đã được overide
        student.eat(); // Bùi Hiên is eating

        // Gọi đến method của lớp con đã được overide
        // Nhưng trong method này có super method từ class cha, nên method của class cha vẫn được gọi
        // Person work... (super class)
        // Bùi Hiên is working (child class)
        student.work();

        // Method của riêng lớp con
        student.display(); // My name is Bùi Hiên
    }
}
