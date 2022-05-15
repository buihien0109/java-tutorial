package vn.techmaster.demo_exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DemoHandleException {
    public static void main(String[] args) {
        // Xử lý exception với try catch
        // try : Thực thi code có khả năng gây ra lỗi
        // catch : Xử lý lỗi nếu xảy ra
        try {
            double result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // Xử lý nhiều exception
        try {
            // NullPointerException
            String text = null;
            System.out.println(text.length());

            // ArithmeticException
            double result = 10 / 0;
            System.out.println(result);
        }  catch (ArithmeticException | NullPointerException e) {
            System.out.println(e.getMessage());
        }

        // Xử lý lỗi với try/catch/finally
        // finally : Luôn thực thi kể cả có lỗi xảy ra hay không
        try {
            double result = 10 / 2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Block finally");
        }

        // Xử lý lỗi với checked exeption
        try {
            File file = new File("text.txt");
            FileReader fileReader = new FileReader(file);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
