package demo_lambada_buildin;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class DemoFunction {
    public static void main(String[] args) {
        // Khai báo 1 list
        List<String> names = new ArrayList<>();
        names.add("Hiên");
        names.add("An");
        names.add("Hằng");
        names.add("Duy");

        // Ví dụ : Loại bỏ giá trị "Hiên" ra khỏi List
        // Cách 1 : Triền khai functional interface Predicate bằng anonymous class
        names.stream().map(new Function<String, Object>() {
            @Override
            public Object apply(String s) {
                return s.toUpperCase();
            }
        }).forEach(new Consumer<Object>() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        });

        // Cách 2 : Tạo các đối tượng sau đó truyền vào trong phương thức
        // 1. Tạo đối tượng Function
        Function<String, Object> function = new Function<>() {
            @Override
            public Object apply(String s) {
                return s.toUpperCase();
            }
        };

        // 1. Tạo đối tượng Consumer
        Consumer<Object> consumer = new Consumer<>() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        };

        // Truyền 2 đối tượng vừa tạo vào trong method tương ứng
        names.stream().map(function).forEach(consumer);

        // Cách 3 : Sử dụng Lambda expresstion để triển khai
        names.stream().map(name -> name.toUpperCase()).forEach(name -> System.out.println(name));

        // Cách 4 : Sử dụng Method Reference
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
