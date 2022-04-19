package vn.techmaster;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        // Khởi tạo array
        int[] numbers = new int[4];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        // Phần tử nào trong mảng chưa được khởi tạo giá trị thì giá trị mặc định là 0;
        numbers[3] = 0;
        System.out.println(Arrays.toString(numbers));

        // Khởi tạo mảng và gán giá trị cho mảng
        String[] names = {"hien", "an", "hoa"};
        System.out.println(Arrays.toString(names));

        // Array reference
        String[] cities = {"ha noi", "hai phong", "thai binh"};
        System.out.println("Mảng cities ban đầu : " + Arrays.toString(cities));

        // Gán giá trị của cities cho citiesOther
        String[] citiesOther = cities;
        System.out.println("Mảng citiesOther ban đầu : " + Arrays.toString(citiesOther));

        // Thay đổi giá trị trong mảng citiesOther
        citiesOther[0] = "da nang";
        System.out.println("Mảng citiesOther sau khi thay đổi : " + Arrays.toString(citiesOther));
        System.out.println("Mảng cities ban đầu : " + Arrays.toString(cities));

        // Lấy độ dài của mảng
        System.out.println("Độ dài của mảng numbers là : " + numbers.length);
        System.out.println("Độ dài của mảng names là : " + names.length);
    }
}
