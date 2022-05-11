package demo_overide;

public class Cat extends Animal{
    // Ghi đè lên phương thức của lớp cha (Animal)
    @Override
    public void sound() {
        System.out.println("Cat Meo Meo ...");
    }

    // Phương thức của riêng class Cat
    public void play() {
        System.out.println("Cat play with ball ...");
    }
}
