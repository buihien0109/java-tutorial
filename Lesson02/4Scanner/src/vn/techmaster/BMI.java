package vn.techmaster;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều cao: ");
        double height = sc.nextDouble();

        System.out.println("Nhập cân nặng: ");
        double weight = sc.nextDouble();

        double bmi = weight/(height*height);

        System.out.println("Chỉ số bmi của bạn là: " + bmi);
    }
}
