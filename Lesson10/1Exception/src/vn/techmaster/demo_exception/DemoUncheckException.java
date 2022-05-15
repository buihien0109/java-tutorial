package vn.techmaster.demo_exception;

public class DemoUncheckException {
    public static void main(String[] args) {
        // Một số uncheck exception phổ biến
        // 1. Chia 1 số cho 0 (ArithmeticException)
        double result = 10 / 0;
        System.out.println(result);

        // 2. Thao tác với đối tượng null (NullPointerException);
        String text = null;
        System.out.println(text.length());

        // 3. Truy cập vào chỉ số không tồn tại (ArrayIndexOutOfBoundsException)
        int[] numbers = {1, 2, 3, 4};
        System.out.println(numbers[5]);

        // 4. Taọ mảng với số phần tử âm (NegativeArraySizeException)
        String[] names = new String[-4];

        // 5. Convert 1 chuỗi không hợp lệ sang số (NumberFormatException)
        int number = Integer.parseInt("1a");
        System.out.println(number);
    }
}
