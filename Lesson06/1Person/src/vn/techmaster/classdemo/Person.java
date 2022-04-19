package vn.techmaster.classdemo;

import java.time.LocalDate;

public class Person {
    // Các thuộc tính của person
    public String name;
    public int age;
    public String address;

    // Constructor mặc định
    public Person() {
        System.out.println("Hàm constuctor mặc định được gọi");
    }

    // Constructor có 1 tham số
    public Person(String name) {
        System.out.println("Hàm constuctor với 1 tham số được gọi");
        this.name = name;
    }

    // Constructor có 2 tham số
    public Person(String name, int age) {
        System.out.println("Hàm constuctor với 2 tham số được gọi");
        this.name = name;
        this.age = age;
    }

    // Contructor full tham số
    public Person(String name, int age, String address) {
        System.out.println("Hàm constuctor với full tham số được gọi");
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void play() {
        System.out.println("Method play được gọi!");
    }

    public void eat(String foodName) {
        System.out.println("Method eat được gọi!");
        System.out.println("Mlem mlem! " + foodName);
    }

    public int getYearOfBirth() {
        System.out.println("Method getYearOfBirth được gọi!");
        return LocalDate.now().getYear() - age;
    }

    @Override
    public String toString() {
        return name + " - " + age + " - " + address;
    }
}
