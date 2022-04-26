package vn.techmaster.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private int id;
    private String name;
    private int age;
    private String address;
    private double point;
    private String classroom;
}
