package vn.techmaster;

public class OperatorPractice {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // c = a được thực hiện trước -> c = 10
        // Sau đó a mới tăng lên a -> a = 11
        int c = a++;
        System.out.println("a = " + a); // 11
        System.out.println("c = " + c); // 10

        // ++a sẽ thực hiện tăng a lên 1 trước -> a = 12
        // Sau đó d được gán = a -> d = 12
        int d = ++a;
        System.out.println("a = " + a); // 12
        System.out.println("d = " + d); // 12

        // b được tăng lên 1 trước -> b = 21
        // a + b sẽ được thực hiên -> e = a + b = 12 + 21 = 33;
        // sau đó a mới tăng lên 1 -> a = 13
        int e = a++ + ++b;
        System.out.println("a = " + a); // 13
        System.out.println("b = " + b); // 21
        System.out.println("e = " + e); // 33

        // a được tăng lên 1 trước -> a = 13 + 1 = 14;
        // b được tăng lên 1 trước -> b = 21 + 1 = 22;
        // f = a + b = 14 + 22 = 36
        int f = ++a + ++b;
        System.out.println("a = " + a); // 14
        System.out.println("b = " + b); // 22
        System.out.println("f = " + f); // 36
    }
}
