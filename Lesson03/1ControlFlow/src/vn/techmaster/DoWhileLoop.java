package vn.techmaster;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        do {
            System.out.println("Nhập a: ");
            a = sc.nextInt();
        } while (a == 0);


        System.out.println("Nhập b: ");
        int b = sc.nextInt();

        System.out.println("Nhập c: ");
        int c = sc.nextInt();
    }
}
