package vn.techmaster.staticdemo;

public class Test {
    public static void main(String[] args) {
        System.out.println("Dòng đầu tiên trong câu lệnh main");

        // Khởi tạo đối tượng film
        Film film = new Film("Người nhện", 120);
        System.out.println(film);
        System.out.println(film.name);
        System.out.println(film.length);

        // Gọi biến static thông qua tên class
        System.out.println(Film.category);

        // Gọi phương thức bình thường
        film.methodNormal();

        // Gọi method static
        Film.methodStatic();

        // Thay đổi giá trị static
        Film.changeCategory();

        // Kiểm tra giá trị mới của biến static sau khi thay đổi
        System.out.println(Film.category);
    }
}
