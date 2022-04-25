package vn.techmaster.downcast_demo;

public class Test {
    public static void main(String[] args) {
        // Downcasting : là dạng chuyển kiểu từ một thể hiện của lớp cha
        // xuống thành đối tượng là thể hiện của lớp con trong quan hệ kế thừa.

        // Ép kiểu tương minh
        Employee employee = new Sale("Bùi Hiên");
        Sale sale = (Sale) employee;

        // Upcast chỉ có thể gọi các phương thức của lớp cha, và các phương thức được overide bởi lớp con
        // Các phương thức của lớp cha
        employee.work(); // Được overide bởi lớp con
        employee.eat(); // Được overide bởi lớp con
        employee.sleep();
        ((Sale) employee).display(); // Muốn gọi display của lớp con phải downcast

        // Downcast để gọi các phương thức của lớp con
        sale.display();
        sale.work();
        sale.eat();
        sale.sleep();
    }
}
