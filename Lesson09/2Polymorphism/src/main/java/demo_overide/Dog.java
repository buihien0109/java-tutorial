package demo_overide;

public class Dog extends Animal{
    // Ghi đè lên phương thức của lớp cha (Animal)
    @Override
    public void eat() {
        System.out.println("Dog eat meat ...");
    }

    // Phương thức của riêng class Dog
     public void sleep() {
         System.out.println("Dog sleep");
     }
}
