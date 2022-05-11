package demo_abstract;

public class Test {
    public static void main(String[] args) {
        // Khởi tạo đối tượng từ abstract class --> Báo lỗi
        // Employee employee = new Employee();

        // Khởi tạo đối tượng Developer
        Developer developer = new Developer(1, "Bùi Hiên", "hien@gmail.com", 1_000_000, 20);

        // Gọi các phương thức của developer
        developer.register();
        System.out.println(developer.calculateSalary());

        // ****************************
        // Khởi tạo đối tượng Tester
        Tester tester = new Tester(2, "Thu Hằng", "hang@gmail.com", 2_000_000, 30);

        // Gọi các phương thức của developer
        tester.register();
        System.out.println(tester.calculateSalary());
    }
}
