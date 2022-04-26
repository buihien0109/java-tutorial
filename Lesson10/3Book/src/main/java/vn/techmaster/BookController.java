package vn.techmaster;

import java.util.List;
import java.util.Scanner;

public class BookController {

    private final BookService bookService = new BookService();

    public void run() {
        Scanner sc = new Scanner(System.in);

        boolean isQuit = false;
        int option = 0;

        while (!isQuit) {
            showMenu();

            System.out.print("Nhập lựa chọn : ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1 -> {
                    List<Book> books = bookService.getBooks();
                    System.out.println("Thông tin books");
                    books.forEach(System.out::println);
                }
                case 2 -> {
                    System.out.print("Nhập tên book : ");
                    String title = sc.nextLine();

                    List<Book> books = bookService.findByName(title);
                    if (!books.isEmpty()) {
                        books.forEach(System.out::println);
                    } else {
                        System.out.println("Không tìm thấy book với tên : " + title);
                    }
                }
                case 3 -> {
                    System.out.print("Nhập danh mục : ");
                    String categoryName = sc.nextLine();

                    List<Book> books = bookService.findByCategory(categoryName);
                    if (!books.isEmpty()) {
                        books.forEach(System.out::println);
                    } else {
                        System.out.println("Không tìm thấy book thuộc danh mục : " + categoryName);
                    }
                }
                case 4 -> {
                    List<Book> books = bookService.sortByPageNumber();
                    System.out.println("Danh sách book theo số trang tăng dần : ");
                    books.forEach(System.out::println);
                }
                case 5 -> {
                    List<Book> books = bookService.sortByReleaseYear();
                    System.out.println("Danh sách book theo năm xuất bản tăng dần : ");
                    books.forEach(System.out::println);
                }
                case 6 -> {
                    isQuit = true;
                }
                default -> {
                    System.out.println("Lựa chọn không hợp lệ");
                }
            }
        }
    }

    public void showMenu() {
        System.out.println("1 - Lấy thông tin toàn bộ sách");
        System.out.println("2 - Tìm sách theo tên");
        System.out.println("3 - Tìm sách theo thể loại");
        System.out.println("4 - Sắp xếp sách theo số trang");
        System.out.println("5 - Sắp xếp sách theo năm xuất bản");
        System.out.println("6 - Thoát");
    }
}
