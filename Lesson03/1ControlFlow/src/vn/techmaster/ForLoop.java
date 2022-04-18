package vn.techmaster;

public class ForLoop {
    public static void main(String[] args) {
        // Thực hiện công việc thức dậy lúc 5:00 trong 30 ngày
        for (int day = 1; day <= 30; day = day + 1) {
            System.out.println("Ngày " + day + " thức dậy lúc 5:00");
        }

        // Thực hiện công việc thức dậy lúc 5:00 trong 30 ngày vào các ngày lẻ
        for (int day = 1; day <= 30; day = day + 1) {
            if (day % 2 == 1) {
                System.out.println("Ngày " + day + " thức dậy lúc 5:00");
            }
        }

        // Hoặc
        for (int day = 1; day <= 30; day = day + 2) {
            System.out.println("Ngày " + day + " thức dậy lúc 5:00");
        }

        // Thực hiện công việc thức dậy lúc 5:00 trong 30 ngày. Cách 7 ngày nghỉ 1 lần
        for (int day = 1; day <= 30; day = day + 1) {
            if (day % 7 == 0) {
                System.out.println("Nghỉ");
                continue;
            }

            System.out.println("Ngày " + day + " thức dậy lúc 5:00");
        }

        // Thực hiện công việc thức dậy lúc 5:00 trong 30 ngày. Đến ngày số 20, chán quá => nghỉ
        for (int day = 1; day <= 30; day = day + 1) {
            if (day == 20) {
                System.out.println("Chán quá. Nghỉ thôi");
                break;
            }
            System.out.println("Ngày " + day + " thức dậy lúc 5:00");
        }

        // ================== Money ==================
        // Trước khi bắt đầu thì số tiền trong ví = 0
        int totalMoney = 0;

        for (int day = 1; day <= 10; day++) {
            // totalMoney = totalMoney + 100000;
            totalMoney += 100000;
        }

        System.out.println(totalMoney);
    }
}
