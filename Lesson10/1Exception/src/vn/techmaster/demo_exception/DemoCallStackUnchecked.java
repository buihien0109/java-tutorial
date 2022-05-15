package vn.techmaster.demo_exception;

public class DemoCallStackUnchecked {
    public static void main(String[] args) {
        methodThree();
    }

    public static void methodOne() {
        throw new ArithmeticException("Lỗi toán học");
    }

    public static void methodTwo() {
        methodOne();
    }

    public static void methodThree() {
        try {
            methodTwo();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
