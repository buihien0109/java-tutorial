package vn.techmaster;

import java.util.Random;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Random rd = new Random();

        // Viết chương trình sinh 1 số ngẫu nhiên từ 0->100 rdNumber. Thực hiện nhập 1 số từ bàn phím number
        // In ra số ngẫu nhiên
        // Nếu số ngẫu nhiên > 90 -> Dừng chương trình
        boolean isCheck = true;
        while (isCheck){
            int randomNumber = rd.nextInt(100);

            System.out.println("Số ngẫu nhiên: " +randomNumber);

            if(randomNumber > 90){
                isCheck = false;
            }
        }

        // Viết chương trình sinh 1 số ngẫu nhiên từ 0->100 rdNumber. Thực hiện nhập 1 số từ bàn phím number
        // so sánh hai số rdNumber với number
        // nếu number > rdNumber -> In ra "Bạn nhập số lớn hơn rồi, cho nhập lại"
        // nếu number < rdNumber -> In ra "Bạn nhập số nhỏ hơn rồi, cho nhập lại"
        // nếu number == rdNumber -> In ra "Chúc mừng bạn nhập đúng rồi"
        boolean isContinue = true;
        Scanner sc = new Scanner(System.in);
        while (isContinue) {
            int rdNumber = rd.nextInt(100);
            System.out.print("Nhập số : ");
            int number = sc.nextInt();
            if(number > rdNumber) {
                System.out.println("Bạn nhập số lớn hơn rồi, cho nhập lại");
            } else if(number < rdNumber) {
                System.out.println("Bạn nhập số nhỏ hơn rồi, cho nhập lại");
            } else {
                System.out.println("Chúc mừng bạn nhập đúng rồi");
                isContinue = false;
            }
        }
    }
}
