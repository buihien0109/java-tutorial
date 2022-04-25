package vn.techmaster.overide_demo;

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
    public void eat() {
        System.out.println("Person eat...");
    }

    public void work() {
        System.out.println("Person work...");
    }

    // Các method getter, setter tương ứng với các thuộc tính
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
