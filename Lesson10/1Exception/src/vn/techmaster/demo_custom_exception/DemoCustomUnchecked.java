package vn.techmaster.demo_custom_exception;

public class DemoCustomUnchecked {
    public static void main(String[] args) {
        try {
            System.out.println(findElement(10));
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int findElement(int value) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            if (number == value) {
                return number;
            }
        }
        throw new NotFoundException("Không tìm thấy phần tử với giá trị = " + value);
    }
}
