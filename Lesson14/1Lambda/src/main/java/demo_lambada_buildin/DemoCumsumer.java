package demo_lambada_buildin;

import java.util.List;
import java.util.function.Consumer;

public class DemoCumsumer {
    public static void main(String[] args) {
        // Khai báo 1 list
        List<String> names = List.of("Hiên", "An", "Hằng", "Duy");

        // Cách 1 : Triền khai functional interface Consumer bằng anonymous class
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        // Cách 2 : Tạo đối tượng Consumer
        Consumer<String> consumer = new Consumer<>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        // Truyền đối tượng vừa tạo vào trong forEach
        names.forEach(consumer);

        // Cách 3 : Sử dụng Lambda expresstion để triển khai Consumer
        names.forEach(name -> System.out.println(name));

        // Cách 4 : Sử dụng method reference
        names.forEach(System.out::println);
    }
}
