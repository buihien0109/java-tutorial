package demo_class;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MyClassOther<T extends String> {
    private T value;

    public void add(T otherValue) {
        System.out.println(value.concat(" ").concat(otherValue));
    }

    public static void main(String[] args) {
        MyClassOther<String> text = new MyClassOther<>("Hello");
        text.add("world");
    }
}
