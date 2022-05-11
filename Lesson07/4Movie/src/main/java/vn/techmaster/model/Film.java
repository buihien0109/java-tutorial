package vn.techmaster.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Film {
    private int id;
    private String title;
    private String category;
    private String director;
    private String premiereDate;

    @Override
    public String toString() {
        return "id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", director='" + director + '\'' +
                ", premiereDate='" + premiereDate + '\'';
    }
}
