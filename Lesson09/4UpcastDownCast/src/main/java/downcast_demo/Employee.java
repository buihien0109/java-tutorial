package vn.techmaster.downcast_demo;

public class Employee {
    // Thuộc tính
    private String name;

    // Constructor của lớp cha
    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    // Phương thức của lớp cha
    // Được overide bởi lớp con
    public void eat() {
        System.out.println("Employee eat...");
    }

    // Được overide bởi lớp con
    public void work() {
        System.out.println("Employee work...");
    }

    // Không được overide
    public void sleep() {
        System.out.println("Employee sleep...");
    }

    // Các method getter, setter tương ứng với các thuộc tính
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
