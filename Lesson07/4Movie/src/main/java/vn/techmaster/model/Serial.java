package vn.techmaster.model;

import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Serial extends Film{
    private int episode; // Số tập phim
    private int avgLength; // thời gian trung bình

    public Serial(int id, String title, String category, String director, String premiereDate, int episode, int avgLength) {
        super(id, title, category, director, premiereDate);
        this.episode = episode;
        this.avgLength = avgLength;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", episode=" + episode +
                ", avgLength=" + avgLength;
    }
}
