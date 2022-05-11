package demo_overload;

public class Calculator {
    // Thay đổi số lượng tham số
    // 2 tham số
    public int sum(int a, int b) {
        return a + b;
    }

    // 3 tham số
    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Thay đổi kiểu dữ liệu của tham số
    public double sum(double a, double b) {
        return a + b;
    }

    // Nếu cùng tham số mà khác kiểu trả về thì không phải là overload -> báo lỗi
//    public double sum(int a, int b) {
//        return (double) (a + b);
//    }
}
