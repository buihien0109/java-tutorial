package vn.techmaster.staticdemo;

public class Film {
    // Property bình thường
    public String name;
    public int length;

    // Property với static keyword
    public static String category = "Action";

    // Hàm khởi tạo


    public Film() {
    }

    public Film(String name, int length) {
        this.name = name;
        this.length = length;
    }

    // Phương thức bình thường
    public void methodNormal() {
        System.out.println("Method Normal");
    }

    // Phương thức static
    public static void methodStatic() {
        System.out.println("Method static");
    }

    public static void changeCategory() {
        category = "Love";
    }

    // Khối static
    static {
        System.out.println("Đây là khối static");
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", length=" + length +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("Phương thức main trong Film");
    }
}
