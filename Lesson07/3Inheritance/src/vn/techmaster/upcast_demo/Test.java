package vn.techmaster.upcast_demo;

public class Test {
    public static void main(String[] args) {
        // Upcasting : Khi biến tham chiếu của lớp cha tham chiếu tới đối tượng của lớp con
        // Ép kiểu không tường minh
        // Person person = new Student("Bùi Hiên");

        // Ép kiểu tường minh
        Person person = (Person) new Student("Bùi Hiên");

        // Đối với các method được overide -> Gọi method của lớp con
        person.eat();
        person.work();

        // Đối với các method không được overide -> Gọi method của lớp cha
        person.sleep();
    }
}
