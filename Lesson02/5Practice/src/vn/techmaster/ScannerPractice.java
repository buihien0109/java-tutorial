package vn.techmaster;

import java.util.Scanner;

public class ScannerPractice {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Bài 1
        scannerEx1();

        // Bài 2
        scannerEx2();
    }

    public static void scannerEx1() {
        System.out.print("Nhập vào số a = ");
        int a = sc.nextInt();

        System.out.print("Nhập vào số b = ");
        int b = sc.nextInt();

        System.out.printf("%d + %d = %d\n", a, b, a + b);
        System.out.printf("%d - %d = %d\n", a, b, a - b);
        System.out.printf("%d * %d = %d\n", a, b, a * b);

        System.out.printf("%d / %d = %.2f\n", a, b, (double) a / b);
        System.out.printf("%d^%d = %d\n", a, b, (int) Math.pow(a, b));
        System.out.printf("%d %% %d = %d\n", a, b, a % b);
    }

    public static void scannerEx2() {
        System.out.print("Nhập vào chuỗi : ");
        String str = sc.nextLine();

        System.out.println("1. Chuỗi in hoa của chuỗi \"" + str + "\" là : " + str.toUpperCase());
        System.out.println("2. Chuỗi in thường của chuỗi \"" + str + "\" là : " + str.toLowerCase());
        System.out.println("3. Số ký tự của chuỗi \"" + str + "\" là : " + str.length());
        System.out.println("4. Ký tự cuối cùng của chuỗi \"" + str + "\" là : " + str.charAt(str.length() - 1));
        System.out.println("5. 5 ký tự cuối cùng của chuỗi \"" + str + "\" là : " + str.substring(0, 5));
        System.out.println("6. Chuỗi \"" + str + "\" có chứa chuỗi \"hello\" hay không : " + str.contains("hello"));
    }
}
