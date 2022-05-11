package demo_interface;

public interface IShape {
    // variable : public, static final
    String name = "Shape";
    int sides = 3;

    // Abstract method
    double getArea();
    double getPerimeter();
    void printInfo();

    // Default method
    default void getSide() {
        System.out.println("Shape have many side ...");
        System.out.println("Shape have at least " + sides + " sides");
    }

    // Static method
    static void display() {
        System.out.println("Hello, my name is " + name);
    }
}
