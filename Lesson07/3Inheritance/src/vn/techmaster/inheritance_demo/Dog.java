package vn.techmaster.inheritance_demo;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    // Định nghĩa phương thức của lớp con
    public void display() {
        System.out.println("My name is " + this.getName());
    }
}
