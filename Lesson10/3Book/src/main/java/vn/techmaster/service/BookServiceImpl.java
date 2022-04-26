package vn.techmaster.service;

import com.google.gson.Gson;
import vn.techmaster.model.Book;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BookServiceImpl implements BookService {
    private List<Book> books;

    public BookServiceImpl() {
        try {
            books = getBooksFromJsonFile("book.json");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Lấy dữ liệu book từ file Json
    @Override
    public List<Book> getBooksFromJsonFile(String fileName) throws IOException {
        Gson gson = new Gson();

        Reader reader = Files.newBufferedReader(Paths.get(fileName));
        List<Book> books = Arrays.asList(gson.fromJson(reader, Book[].class));

        reader.close();

        return books;
    }

    // Lấy danh sách book
    @Override
    public List<Book> getBooks() {
        return books;
    }

    // Tìm kiếm book theo tiêu đề
    @Override
    public List<Book> findByName(String title) {
        return books
                .stream()
                .filter(book -> book.getTitle().toLowerCase().contains(title.toLowerCase()))
                .collect(Collectors.toList());
    }

    // Tìm kiếm book theo danh mục
    @Override
    public List<Book> findByCategory(String categoryName) {
        return books
                .stream()
                .filter(book -> book.getCategory().contains(categoryName))
                .collect(Collectors.toList());
    }

    // Sắp xếp book theo số trang tăng dần
    @Override
    public List<Book> sortByPageNumber() {
        return books
                .stream()
                .sorted((a, b) -> a.getPageNumber() - b.getPageNumber())
                .collect(Collectors.toList());
    }

    // Sắp xếp book theo năm phát hành tăng dần
    @Override
    public List<Book> sortByReleaseYear() {
        return books
                .stream()
                .sorted((a, b) -> a.getReleaseYear() - b.getReleaseYear())
                .collect(Collectors.toList());
    }
}
