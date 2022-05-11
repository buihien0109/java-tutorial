package demo_overload;

public class Test {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Calculator
        Calculator calculator = new Calculator();

        // Test các phương thức
        System.out.println(calculator.sum(2,3));
        System.out.println(calculator.sum(2,3,4));
        System.out.println(calculator.sum(2.1, 5.4));
    }
}
