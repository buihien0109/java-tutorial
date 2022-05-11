package demo_overide;

public class Test {
    public static void main(String[] args) {
        // Khởi tạo đối tượng animal
        Animal animal = new Animal();
        animal.eat();
        animal.sound();

        // Khởi tạo đối tượng dog
        Dog dog = new Dog();
        dog.eat();
        dog.sound();
        dog.sleep();

        // Khởi tạo đối tượng cat
        Cat cat = new Cat();
        cat.eat();
        cat.sound();
        cat.play();
    }
}
