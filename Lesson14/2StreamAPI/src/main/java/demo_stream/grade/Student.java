package demo_stream.grade;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

enum Gender {
    MALE("Nam"), FEMALE("Nữ");

    Gender(String name) {
    }
}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String name;
    private int grade;
    private Gender gender;

    public void printInfo() {
        System.out.println(name + " - " + grade + " - " + gender.name());
    }
}
