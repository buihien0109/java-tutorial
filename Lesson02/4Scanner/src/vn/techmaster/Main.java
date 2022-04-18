package vn.techmaster;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner nhập dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tên: ");
        String name = sc.nextLine();

        System.out.println("Nhập địa chỉ: ");
        String address = sc.nextLine();

        System.out.println("Nhập tuổi: ");
        int age = sc.nextInt();

        System.out.println("Xin chào, tôi tên là " + name + ", " +
                "năm nay tôi " + age + " tuổi, " +
                "tôi đến từ " + address);
    }
}
