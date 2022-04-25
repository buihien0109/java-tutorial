package vn.techmaster;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {
    private List<Book> books;

    public BookService() {
        try {
            books = getBooksFromJsonFile("book.json");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Book> getBooksFromJsonFile(String fileName) throws IOException {
        Gson gson = new Gson();

        Reader reader = Files.newBufferedReader(Paths.get(fileName));
        List<Book> books = Arrays.asList(gson.fromJson(reader, Book[].class));

        reader.close();

        return books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Book> findByName(String title) {
        return books
                .stream()
                .filter(book -> book.getTitle().contains(title))
                .collect(Collectors.toList());
    }

    public List<Book> findByCategory(String categoryName) {
        return books
                .stream()
                .filter(book -> book.getCategory().contains(categoryName))
                .collect(Collectors.toList());
    }

    public List<Book> sortByPageNumber() {
        return books
                .stream()
                .sorted((a, b) -> a.getPageNumber() - b.getPageNumber())
                .collect(Collectors.toList());
    }

    public List<Book> sortByReleaseYear() {
        return books
                .stream()
                .sorted((a, b) -> a.getReleaseYear() - b.getReleaseYear())
                .collect(Collectors.toList());
    }
}
