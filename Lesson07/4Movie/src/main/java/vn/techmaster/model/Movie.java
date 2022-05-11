package vn.techmaster.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Movie extends Film {
    private int length;

    public Movie(int id, String title, String category, String director, String premiereDate, int length) {
        super(id, title, category, director, premiereDate);
        this.length = length;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", length=" + length;
    }
}
