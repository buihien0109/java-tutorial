package vn.techmaster;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private int id;
    private String title;
    private List<String> category;
    private String author;

    @SerializedName("page_number")
    private int pageNumber;

    @SerializedName("release_year")
    private int releaseYear;

    @Override
    public String toString() {
        return "id=" + id +
                ", title='" + title + '\'' +
                ", category=" + category +
                ", author='" + author + '\'' +
                ", pageNumber=" + pageNumber +
                ", releaseYear=" + releaseYear;
    }
}
