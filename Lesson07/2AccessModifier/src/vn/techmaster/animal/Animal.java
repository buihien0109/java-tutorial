package vn.techmaster.animal;

import vn.techmaster.model.Person;

public class Animal {
    public static void main(String[] args) {
        Person person = new Person("Bùi Hiên", 25, "hien@gmail.com", "Thái Bình", 10_000_000);

        // Truy cập vào thuộc tính của đối tượng
        System.out.println(person.address); // Public property

        // Phương thức
        person.display(); // Public method
    }
}
