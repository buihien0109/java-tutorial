package vn.techmaster.downcast_demo;

public class Sale extends Employee {
    public Sale() {
    }

    public Sale(String name) {
        super(name);
    }

    // Định nghĩa phương thức của lớp con
    public void display() {
        System.out.println("My name is " + this.getName());
    }

    // Ghi đè lại các phương thức của lớp cha
    // Ghi đề phương thức eat của lớp cha : Thay đổi hoàn toàn dựa trên logic của lớp con
    @Override
    public void eat() {
        System.out.println(this.getName() + " is eating");
    }

    // Ghi đề phương thức work của lớp cha : Sử dụng logic của lớp cha + logic của lớp con muốn thực hiện
    @Override
    public void work() {
        super.work();
        System.out.println(this.getName() + " is working");
    }
}
