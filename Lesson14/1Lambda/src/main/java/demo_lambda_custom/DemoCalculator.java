package demo_lambda_custom;

@FunctionalInterface
interface Calculator {
    int calculator(int a, int b);
}

public class DemoCalculator {
    public static void main(String[] args) {
        // Cộng 2 số
        Calculator c = (a, b) -> a + b;
        System.out.println(c.calculator(3, 4));

        // Trừ 2 số
        Calculator c1 = (a, b) -> a - b;
        System.out.println(c1.calculator(5, 2));

        // Trừ 2 số
        Calculator c2 = (a, b) -> a * b;
        System.out.println(c2.calculator(2, 10));

        // Trừ 2 số
        Calculator c3 = (a, b) -> a / b;
        System.out.println(c3.calculator(8, 4));
    }
}
