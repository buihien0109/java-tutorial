package vn.techmaster;

public class PrintFormat {
    public static void main(String[] args) {
        // Nếu để dấu "-" thì nội dung căn sang bên lề trái
        // Ngược lại thì nội dung căn sang lề phải (mặc định)
        System.out.printf("%-20s %-18s %-18s\n", "Họ tên", "Email", "Số điện thoại");
        System.out.printf("%-20s %-18s %-18d\n", "Bùi Văn Hiên", "hien@gmail.com", 25);
        System.out.printf("%-20s %-18s %-18d\n", "Nguyễn Thị Thu Hằng", "hien@gmail.com", 27);
        System.out.printf("%-20s %-18s %-18d\n", "Bùi Phương Loan", "hien@gmail.com", 18);
    }
}
