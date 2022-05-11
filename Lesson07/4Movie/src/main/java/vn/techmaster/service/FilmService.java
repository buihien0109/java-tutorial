package vn.techmaster.service;

import vn.techmaster.model.Movie;
import vn.techmaster.model.Serial;

public class FilmService {
    private Movie[] movies;
    private Serial[] serials;

    public FilmService() {
        init();
    }

    private void init() {
        movies = new Movie[]{
                new Movie(1, "BÓNG MA 3: SỰ THẬT PHÍA SAU", "Hành động", "Bùi Hiên", "22/01/2021", 123),
                new Movie(2, "CUỘC CHIẾN Ở ATLANTIS", "Trinh thám", "Thu Hằng", "13/04/2021", 100),
                new Movie(3, "LONG LĨNH TRÙNG CỐC", "Hành động", "Minh Duy", "25/06/2022", 92),
                new Movie(4, "ĐẾN KHI TA GẶP LẠI", "Hài", "Phương Loan", "01/09/2022", 134)
        };

        serials = new Serial[]{
                new Serial(1, "KỴ SĨ MẶT TRĂNG (PHẦN 1)", "Hành động", "Nguyễn Văn A", "13/02/2022", 21, 45),
                new Serial(2, "NÀNG VỆ SĨ CỦA TÔI", "Tình cảm", "Trần Văn B", "04/03/2022", 14, 41),
                new Serial(3, "KHOẢNH KHẮC THẦN TÌNH YÊU", "Hành động", "Ngô Thị C", "24/02/2022", 29, 43),
                new Serial(4, "XIN GỌI TÔI LÀ TỔNG GIÁM", "Trinh thám", "Lương Ngọc D", "02/04/2022", 22, 50)
        };
    }

    public void showMovie() {
        for (Movie m : movies) {
            System.out.println(m);
        }
    }

    public void showSerial() {
        for (Serial s : serials) {
            System.out.println(s);
        }
    }

    public void findMovieByTitle(String title) {
        int count = 0;
        for (Movie m : movies) {
            if(m.getTitle().toLowerCase().contains(title.toLowerCase())) {
                count++;
                System.out.println(m);
            }
        }

        if(count == 0) {
            System.out.println("Không có movie với tên : " + title);
        }
    }

    public void findSerialByTitle(String title) {
        int count = 0;
        for (Serial s : serials) {
            if(s.getTitle().toLowerCase().contains(title.toLowerCase())) {
                count++;
                System.out.println(s);
            }
        }

        if(count == 0) {
            System.out.println("Không có serial với tên : " + title);
        }
    }
}
