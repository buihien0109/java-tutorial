package vn.techmaster.builderdemo;

public class Test {
    public static void main(String[] args) {
        // Tạo object với builder
        Employee employee = Employee.builder()
                .withId(100)
                .withName("Bùi Hiên")
                .withEmail("hien@gmail.com")
                .withSalary(2000000)
                .build();

        System.out.println(employee);

        // Tạo ra đối tượng employee mới
        Employee employee1 = Employee.builder()
                .withId(100)
                .withName("Bùi Hiên")
                .build();

        System.out.println(employee1);
    }
}
