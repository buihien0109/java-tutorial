package vn.techmaster;

import vn.techmaster.controller.BookController;

public class Main {
    public static void main(String[] args) {
        BookController bookController = new BookController();
        bookController.run();
    }
}
