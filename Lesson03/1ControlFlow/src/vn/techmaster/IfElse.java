package vn.techmaster;

public class IfElse {

    public static void main(String[] args) {
	    // Câu lệnh điều kiện if
        int hour = 6;
        if (hour < 10) {
            System.out.println("Good morning!");
        }

        // Câu lệnh điều kiện if-else
        if (hour < 12) {
            System.out.println("Good morning!");
        } else {
            System.out.println("Good afternoon!");
        }

        // Câu lệnh điều kiện if/else if/else
        if (hour < 12) {
            System.out.println("Good morning!");
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Good afternoon!");
        } else {
            System.out.println("Good evening!");
        }

        // Câu lệnh điều kiện lồng nhau
        int number = 12;

        if(number > 0) {
            if(number % 2 == 0) {
                System.out.println("Số dương chẵn");
            } else {
                System.out.println("Số dương lẻ");
            }
        } else if (number < 0) {
            System.out.println("Số âm");
        } else {
            System.out.println("Số 0");
        }

        // Toán tử 3 ngôi
        String message = hour < 12 ? "Good morning!" : "Good afternoon!";
        System.out.println(message);

        // Toán tử 3 ngôi lồng nhau
        String message1 = number > 0
                ? number % 2 == 0
                    ? "Số dương chẵn"
                    : "Số dương lẻ"
                : number < 0
                    ? "Số âm"
                    : "Số 0";

        System.out.println(message1);
    }
}
