package vn.techmaster.demo_exception;

import java.io.IOException;

public class DemoThrowAndThrows {
    public static void main(String[] args) {
        // Xảy ra lỗi nếu gọi trực tiếp
        // validateAge(17);

        // Xử lý lỗi bằng try/catch
        try {
            validateAge(17);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    // "throw" được sử dụng để ném ra một exception cụ thể.
    // Có thể ném một exception checked hoặc exception unchecked bằng "throw".
    // Nhưng hay sử dụng để ném ra exception unchecked hoặc exception custom
    public static void validateAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Chưa đủ tuổi đi nghĩa vụ");
        } else {
            System.out.println("Đã đủ tuổi đi nghĩa vụ");
        }
    }

    // "throws" được sử dụng để khai báo một ngoại lệ
    // Thường sử dụng cho các ngoại lệ "checked"
    public static void demo() throws IOException {
        throw new IOException("Checked Exception ...");
    }
}
