package vn.techmaster.demo_custom_exception;

public class DemoCustomChecked {
    public static void main(String[] args) {
        try {
            demo();
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void demo() throws CustomException {
        throw new CustomException("Lỗi xảy ra");
    }
}
