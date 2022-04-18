package vn.techmaster;

public class Main {
    public static int numberGlobal = 10;

    public static void main(String[] args) {
        System.out.println("Hello world");

        // Khai báo biến
        String firstName, lastName;

        // Khởi tạo giá trị cho biến
        firstName = "Bùi";
        lastName = "Hiên";

        // Vừa khai báo vừa khởi tạo giá trị cho biến
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        int age = 25;
        System.out.println("Xin chào các bạn, mình tên là " + fullName
        + ". Mình sinh năm " + (2022 - 25) + " và năm nay mình " + age + " tuổi");

        // Khai báo 1 số biến kiểu khác
        int money = 1_500_000_000;
        long moneyMore = 10_500_000_000L;
        System.out.println("Tài khoản không có gì ngoài tiền " + money
                + ". Và rất nhiều tiền " + moneyMore);

        boolean isMarried = false;
        System.out.println("isMarried = " + isMarried + " là chưa lấy vợ nhé");

        // Biến có dấu phẩy động
        float weight = 70.5f;
        double height = 1.8;

        System.out.println("Mấy chục năm cuộc đời, vốn chỉ có " + weight + " cân thịt"
        + " và cái sào dài " + height + " mét");

        // Kiểu char -> search mã ASCII
        char charA = 'A';
        System.out.println("Tập đánh vần nào " + charA);

        char charAOther = 97;
        System.out.println("Tiếp tục đánh vần nào " + charAOther);

        // Ép kiểu
        // 1. Từ kiểu dữ liểu nhỏ -> lớn (ép kiểu ngầm định - trình biên dịch tự biết và thực hiện)
        int number = 10;
        long number1 = number;
        float number2 = number;

        System.out.println(number);
        System.out.println(number1);
        System.out.println(number2);

        // Kiểm tra kiểu dữ liệu
        System.out.println(((Object)number).getClass().getName());
        System.out.println(((Object)number1).getClass().getName());
        System.out.println(((Object)number2).getClass().getName());

        // Ép kiểu tường minh
        double heightValue = 1.7;
        int heightValueConvert = (int) heightValue;

        System.out.println(heightValue);
        System.out.println(heightValueConvert);

        // Biến toàn cục
        System.out.println(numberGlobal);

        // Biến cục bộ
        {
            int numberLocal = 20;
            System.out.println(numberLocal);
        }
        // Lỗi khi cố tình truy cập ngoài phạm vi của biến
        // System.out.println(numberLocal);
    }
}
