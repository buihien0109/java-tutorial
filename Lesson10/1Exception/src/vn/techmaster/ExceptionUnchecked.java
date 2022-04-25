package vn.techmaster;

public class ExceptionUnchecked {
    public static void main(String[] args) {
        try {
            methodThree();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void methodOne() {
        double result = 10/0;
        System.out.println(result);
    }

    public static void methodTwo() {
        methodOne();
    }

    public static void methodThree() {
        methodTwo();
    }
}
