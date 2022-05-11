package vn.techmaster.upcast_demo;

public class Person {
    // Thuộc tính
    private String name;

    // Constructor của lớp cha
    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    // Phương thức của lớp cha
    // Được overide bởi lớp con
    public void eat() {
        System.out.println("Person eat...");
    }

    // Được overide bởi lớp con
    public void work() {
        System.out.println("Person work...");
    }

    // Không được overide
    public void sleep() {
        System.out.println("Person sleep...");
    }

    // Các method getter, setter tương ứng với các thuộc tính
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
