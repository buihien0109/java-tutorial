package model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Player {
    private int number;
    private String name;
    private Position position;
}
