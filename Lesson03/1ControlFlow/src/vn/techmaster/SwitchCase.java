package vn.techmaster;

public class SwitchCase {
    public static void main(String[] args) {
        int money = 10000;

        // Trường hợp switch case bình thường
        switch (money) {
            case 12000: {
                System.out.println("Cà phê sữa");
                break;
            }
            case 10000: {
                System.out.println("Cà phê đá");
                break;
            }
            case 8000: {
                System.out.println("String dâu");
                break;
            }
            case 2000: {
                System.out.println("Trà đá");
                break;
            }
            default: {
                System.out.println("Không có đồ uống phù hợp");
                break;
            }
        }

        // Trường hợp switch case có nhiều trường hợp bằng nhau
        switch (money) {
            case 12000:
            case 15000:
            case 20000: {
                System.out.println("Cà phê sữa");
                break;
            }
            case 10000: {
                System.out.println("Cà phê đá");
                break;
            }
            case 8000: {
                System.out.println("String dâu");
                break;
            }
            case 2000: {
                System.out.println("Trà đá");
                break;
            }
            default: {
                System.out.println("Không có đồ uống phù hợp");
                break;
            }
        }

        // Switch case expression
        switch (money) {
            case 12000 -> System.out.println("Cà phê sữa");
            case 10000 -> System.out.println("Cà phê đá");
            case 8000 -> System.out.println("String dâu");
            case 2000 -> System.out.println("Trà đá");
            default -> System.out.println("Không có đồ uống phù hợp");
        }

        // Switch case expression có nhiều trường hợp bằng nhau
        switch (money) {
            case 12000, 15000, 20000 -> System.out.println("Cà phê sữa");
            case 10000 -> System.out.println("Cà phê đá");
            case 8000 -> System.out.println("String dâu");
            case 2000 -> System.out.println("Trà đá");
            default -> System.out.println("Không có đồ uống phù hợp");
        }

        // Switch case expression gán cho 1 biến
        String message = switch (money) {
            case 12000 -> "Rất nhiều tiền";
            case 10000 -> "Nhiều tiền";
            case 8000 -> "Trung bình";
            case 2000 -> "Ít tiền";
            default -> "Nghèo rớt mùng tơi";
        };
        System.out.println(message);
    }
}
