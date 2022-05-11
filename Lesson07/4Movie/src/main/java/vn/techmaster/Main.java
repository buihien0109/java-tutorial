package vn.techmaster;

import vn.techmaster.model.Movie;
import vn.techmaster.model.Serial;
import vn.techmaster.service.FilmService;

public class Main {
    public static void main(String[] args) {
        FilmService filmService = new FilmService();

        // In ra danh sách movie và serial;
        filmService.showMovie();
        filmService.showSerial();

        // Tìm kiếm theo tên

    }
}
