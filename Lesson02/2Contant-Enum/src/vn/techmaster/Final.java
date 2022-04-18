package vn.techmaster;

public class Final {

    public static void main(String[] args) {
	    // Khai báo hằng số sử dụng từ khóa final
        // 1. Khai báo trước, gán giá trị sau
        final String message;
        message = "Xin chào";
        System.out.println(message);

        // 2. Vừa khai báo, vừa gán giá trị
        final int year = 1997;
        System.out.println(year);

        // Thay đổi giá trị của hằng số
        // year = 2022; => Không thể thực hiện
    }
}
