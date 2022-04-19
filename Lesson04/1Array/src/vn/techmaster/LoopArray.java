package vn.techmaster;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LoopArray {
    public static void main(String[] args) {
        int[] numbers = {10, 30, 20, 40};

        // Sử dụng vòng for qua mảng
        // Sử dụng for bình thường
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Duyệt sử dụng foreach
        for (int number : numbers) {
            System.out.println(number);
        }

        // Sắp xếp mảng tăng dần
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        // Sắp xếp giảm dần
        // Cách 1 : Sử dụng wrapper class and Collections class
        Integer[] newNumbers = new Integer[numbers.length];
        int i = 0;
        for (int value : numbers) {
            newNumbers[i++] = value;
        }
        Arrays.sort(newNumbers, Collections.reverseOrder());
        System.out.println(Arrays.toString(newNumbers));

        // Cách 2 : Sắp xếp tăng dần -> swap giá trị lại
        for (int j = 0; j < (int) numbers.length / 2; j++) {
            int temp = numbers[j];
            numbers[j] = numbers[numbers.length - j - 1];
            numbers[numbers.length - j - 1] = temp;
        }
        System.out.println(Arrays.toString(numbers));

        // Cách 3 : Sử dụng thuật toán sắp xếp
        System.out.println("---------");
        int[] ages = {30, 21, 10, 41};
        for (int k = 0; k < ages.length; k++) {
            for (int m = k + 1; m < ages.length; m++) {
                if(ages[k] > ages[m]) {
                    int temp = ages[k];
                    ages[k] = ages[m];
                    ages[m] = temp;
                }
                System.out.println(Arrays.toString(ages));
            }
        }
        System.out.println("---------");

        // Bản chất sắp xếp tăng dần
        // 30, 20, 10, 40
        // 20 30 10 40
        // 10 30 20 40
        // 10 20 30 40


        // Bản chất sắp xếp giảm dần
        // 30, 20, 10, 40
        // 40 20 10 30
        // 40 30 10 20
        // 40 30 20 10
        System.out.println(Arrays.toString(ages));

        // Tính tổng các phần tử của vòng lặp
        int total = 0;
        for (int age: ages) {
            total += age;
        }
        System.out.println("Tổng các phần tử trong mảng ages = " + total);

        int totalOdd = 0;
        for (int age: ages) {
            if(age % 2 == 1) {
                totalOdd += age;
            }
        }
        System.out.println("Tổng các phần tử lẻ trong mảng ages = " + totalOdd);

        // Tìm số lớn nhất trong mảng
        // Sắp xếp tăng dần -> Lấy phần tử cuối cùng trong mảng
        // Sắp xếp giảm dần -> Lấy phần tử đầu tiên trong mảng

        int max = ages[0];
        for (int age : ages) {
            if(max < age) {
                max = age;
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng ages là : " + max);

        // Nhập mảng từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào độ dài của mảng : ");
        int length = sc.nextInt();

        int[] newArr = new int[length];

        // Nhập vào giá trị của từng phần tử
        for (int j = 0; j < newArr.length; j++) {
            System.out.print("Nhập vào phần tử thứ " + (j + 1) + " : ");
            newArr[j] = sc.nextInt();
        }

        // In ra phần tủ của mảng vừa nhập
        System.out.println("In mảng vừa nhập");
        System.out.println(Arrays.toString(newArr));
    }
}
