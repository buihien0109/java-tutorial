package demo_stream.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DemoStream {
    public static void main(String[] args) {
        // Một số cách tạo stream
        // Cách 1 : Sử dụng Stream.of
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);

        // Cách 2 : Sử dụng Stream.builder
        Stream<String> names = Stream.<String>builder()
                .add("Hiên")
                .add("An")
                .add("Ngọc")
                .build();

        // Cách 3 : Sử dụng range
        IntStream intStream = IntStream.range(1, 10);

        // Cách 4 : Sử dụng Arrays.stream
        int[] numbers1 = {1, 2, 3, 4, 5};
        IntStream intStream1 = Arrays.stream(numbers1);

        // Cách 5 : Tạo stream từ Collection
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Stream<Integer> listStream = list.stream();
    }
}
