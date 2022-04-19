package vn.techmaster;

import vn.techmaster.model.Book;
import vn.techmaster.service.BookService;

public class Main {

    public static void main(String[] args) {
        // Khởi tạo đối tượng book service
        BookService bookService = new BookService();

	    // Danh sách book
        System.out.println("****** Danh sách book ******");
        for (Book book : bookService.getBooks()) {
            System.out.println(book);
        }

        // Tìm kiếm book theo tên
        // Ví dụ : "Nghìn lẻ một đêm"
        System.out.println("\n****** Tìm kiếm sách theo tên ******");
        bookService.findByTitle("Nghìn lẻ một đêm.");

        // Tìm kiếm sách theo category
        // Ví dụ : "tiểu thuyết"
        System.out.println("\n****** Tìm kiếm sách category ******");
        bookService.findByCategory("tiểu thuyết");

        // Tìm kiếm sách theo năm xuất bản hiện tại (2022)
        System.out.println("\n****** Tìm kiếm sách năm xuất bản hiện tại ******");
        bookService.findByPublishingOfThisYear();
    }
}
