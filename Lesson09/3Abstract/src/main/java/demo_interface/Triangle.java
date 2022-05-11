package demo_interface;

public class Triangle implements IShape{
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public void printInfo() {
        System.out.printf("Side A = %f, Side B = %f, Side C = %f\n", sideA, sideB, sideC);
    }

    @Override
    public void getSide() {
        System.out.println("Triangle have 3 side");
    }
}
