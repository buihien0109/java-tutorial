package vn.techmaster.inheritance_demo;

public class Test {

    public static void main(String[] args) {
        // Khởi tạo đối tượng dog từ lớp Dog
        Dog dog = new Dog();

        // truy cập vào field của class Animal
        dog.setName("Rohu");
        dog.display(); // Gọi phương thức của lớp Dog
        dog.eat(); // Gọi phương thức của lớp Animal

        // Khởi tạo đối tượng Dog bằng constructor có tham số, super từ class Animal
        Dog dog1 = new Dog("Nick");

        // Gọi 1 số phương thức ứng với dog1 instance
        dog1.eat();
        dog1.display();
    }
}
