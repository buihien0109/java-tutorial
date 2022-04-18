package vn.techmaster;

import java.util.Scanner;

public class FixScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tên : ");
        String name = scanner.nextLine();

        System.out.println("Nhập tuổi : ");
        // Cách 1:
        // Khắc phục trôi lệnh sử dụng Integer.parseInt
        int age = Integer.parseInt(scanner.nextLine());

        // Cách 2:
        // Khắc phục trôi lệnh sử dụng nextLine()
        // int age = scanner.nextInt();
        // scanner.nextLine();

        System.out.println("Nhập email : ");
        String email = scanner.nextLine();

        System.out.println("--- Thông tin user ---");
        System.out.println("Họ : " + name);
        System.out.println("Tuổi : " + age);
        System.out.println("Email : " + email);
    }
}
