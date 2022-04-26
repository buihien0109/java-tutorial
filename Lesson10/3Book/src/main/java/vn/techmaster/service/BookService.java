package vn.techmaster.service;

import vn.techmaster.model.Book;

import java.io.IOException;
import java.util.List;

public interface BookService {
    // Lấy dữ liệu book từ file Json
    List<Book> getBooksFromJsonFile(String fileName) throws IOException;

    // Lấy danh sách book
    List<Book> getBooks();

    // Tìm kiếm book theo tiêu đề
    List<Book> findByName(String title);

    // Tìm kiếm book theo danh mục
    List<Book> findByCategory(String categoryName);

    // Sắp xếp book theo số trang tăng dần
    List<Book> sortByPageNumber();

    // Sắp xếp book theo năm phát hành tăng dần
    List<Book> sortByReleaseYear();
}
