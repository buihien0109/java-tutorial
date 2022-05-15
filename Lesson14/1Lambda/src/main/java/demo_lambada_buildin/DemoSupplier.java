package demo_lambada_buildin;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class DemoSupplier {
    public static void main(String[] args) {

        // Khởi tạo đối tượng random để random giá trị
        Random random = new Random();

        // Tạo list bao gồm 5 phần tử được random
        // Cách 1 : Triển khai Supplier sử dụng anonymous class
        List<Integer> numbers = Stream.generate(new Supplier<Integer>() {
            @Override
            public Integer get() {
                return random.nextInt(10);
            }
        }).limit(5).toList();

        numbers.forEach(System.out::println);

        // Cách 2 : Tạo đối tượng Supplier bên ngoài sau đó truyền vào method tương ứng
        Supplier<Integer> supplier = new Supplier<>() {
            @Override
            public Integer get() {
                return random.nextInt(10);
            }
        };

        List<Integer> numbers1 = Stream.generate(supplier).limit(5).toList();

        numbers1.forEach(System.out::println);

        // Cách 3 : Sử dụng lambda expresstion
        List<Integer> numbers2 = Stream.generate(() -> random.nextInt(10)).limit(5).toList();

        numbers2.forEach(System.out::println);
    }
}
