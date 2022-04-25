package vn.techmaster.model;

public class Dog {
    public static void main(String[] args) {

        Person person = new Person("Bùi Hiên", 25, "hien@gmail.com", "Thái Bình", 10_000_000);

        System.out.println(person.address); // public
        System.out.println(person.email); // default
        System.out.println(person.salary); // protected

        person.display(); // public
    }
}
