package vn.techmaster.animal;

import vn.techmaster.model.Person;

public class Teacher extends Person {

    public Teacher() {
    }

    public Teacher(String name, int age, String email, String address, int salary) {
        super(name, age, email, address, salary);
    }

    public static void main(String[] args) {
        // Khai báo đối tượng thuộc super class
        Person person = new Person("Bùi Hiên", 25, "hien@gmail.com", "Thái Bình", 10_000_000);

        // Truy cập vào thuộc tính của đối tượng
        System.out.println(person.address); // Public
        person.display(); // Public

        // Khai báo đối tượng sub class
        Teacher teacher = new Teacher("Thu Hằng", 28, "hang@gmail.com", "Hưng Yên", 13_000_000);

        System.out.println(teacher.address); // public
        System.out.println(teacher.salary); // protected

        teacher.display(); // public
        teacher.sayHello(); // protected
    }
}
