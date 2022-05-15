package vn.techmaster.demo_exception;

import java.io.FileNotFoundException;

public class DemoCallStackChecked {
    public static void main(String[] args) {
        methodThree();
    }

    // Quá trình lan truyền exception không xảy ra đối với checked exception.
    public static void methodOne() throws FileNotFoundException {
        throw new FileNotFoundException("Không tìm thấy file");
    }

    // Để chuyển một checked exception cho method phía bên dưới stack xử lý
    // bắt buộc chúng ta phải sử dụng từ khoá throws
    // Nếu không chúng ta bắt buộc phải try-catch để xử lý
    // hoặc bị trình biên dịch báo lỗi.
    public static void methodTwo() throws FileNotFoundException {
        methodOne();
    }

    public static void methodThree() {
        try {
            methodTwo();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
