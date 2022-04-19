package vn.techmaster;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Nhập mảng
        int[] arr = inputArray();
        boolean isQuit = false;
        int option = 0;

        while (!isQuit){
            showMenu();

            System.out.print("Nhập lựa chọn : ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1 -> {
                    System.out.print("Mảng vừa nhập : ");
                    show(arr);
                }
                case 2 -> {
                    System.out.println("Tổng các phần tử trong mảng = " + sum(arr));
                }
                case 3 -> {
                    System.out.println("Giá trị lớn nhất trong mảng = " + findMax(arr));
                }
                case 4 -> {
//                    menu.sortAsc(arr);
                    int[] arrSort = sortAsc(arr);
                    System.out.print("Mảng sau khi sắp xếp tăng dần : ");
                    show(arrSort);
                }
                case 5 -> {
                    isQuit = true;
                }
                default -> {
                    System.out.println("Lựa chọn không hợp lệ");
                }
            }
        }
    }

    public static void showMenu() {
        System.out.println("1 - In mảng");
        System.out.println("2 - Tính tổng các phần tử trong mảng");
        System.out.println("3 - Tìm số lớn nhất trong mảng");
        System.out.println("4 - Sắp xếp mảng tăng dần");
        System.out.println("5 - Thoát chương trình");
    }

    public static int[] inputArray() {
        System.out.print("Nhập vào độ dài của mảng : ");
        int length = Integer.parseInt(sc.nextLine());

        int[] arr = new int[length];

        // Nhập vào giá trị của từng phần tử
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập vào phần tử thứ " + (i + 1) + " : ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        return arr;
    }

    public static void show(int[] arr) {
        for (int value: arr) {
            System.out.printf("%d\t", value);
        }
        System.out.println();
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int value: arr) {
            total += value;
        }
        return total;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int value : arr) {
            if(max < value) {
                max = value;
            }
        }
        return max;
    }

//    public static void sortAsc(int[] arr) {
//        Arrays.sort(arr);
//    }

    public static int[] sortAsc(int[] arr) {
        // Copy
        int[] arrCopy = Arrays.copyOf(arr, arr.length);

        // Sắp xếp
        Arrays.sort(arrCopy);

        // Trả về mảng copy sau khi sắp xếp
        return arrCopy;
    }
}
