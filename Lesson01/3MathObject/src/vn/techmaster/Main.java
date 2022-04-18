package vn.techmaster;

public class Main {

    public static void main(String[] args) {
        System.out.println(Math.PI);

        System.out.println(Math.max(10, 20));
        System.out.println(Math.min(10, 20));

        System.out.println(Math.abs(10));
        System.out.println(Math.abs(-10));

        System.out.println(Math.ceil(1.1));
        System.out.println(Math.ceil(1.9));

        System.out.println(Math.floor(1.1));
        System.out.println(Math.floor(1.9));

        System.out.println(Math.round(1.1));
        System.out.println(Math.round(1.9));

        System.out.println(Math.random());
        System.out.println((int) Math.floor(Math.random() * 10)); // 0 -> 9;
        System.out.println((int) Math.floor(Math.random() * (100 - 10 + 1) + 10)); // 10 -> 100;

        System.out.println(Math.pow(2, 4));

        System.out.println(Math.sqrt(10));
    }
}
