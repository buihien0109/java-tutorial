package demo_lambada_buildin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DemoPredicate {
    public static void main(String[] args) {
        // Khai báo 1 list
        List<String> names = new ArrayList<>();
        names.add("Hiên");
        names.add("An");
        names.add("Hằng");
        names.add("Duy");

        // Ví dụ : Loại bỏ giá trị "Hiên" ra khỏi List
        // Cách 1 : Triền khai functional interface Predicate bằng anonymous class
        names.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.equals("Hiên");
            }
        });

        // Cách 2 : Tạo đối tượng Predicate
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.equals("Hiên");
            }
        };

        // Truyền đối tượng vừa tạo vào trong removeIf
        names.removeIf(predicate);

        // Cách 3 : Sử dụng Lambda expresstion để triển khai Predicate
        names.removeIf(name -> name.equals("Hiên"));

        // ************************************************
        // Tìm số lẻ trong list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = getNumberIsOdd(numbers, a -> a % 2 == 1);

        System.out.println();
        result.forEach(System.out::println);
    }

    // Method : tìm số lẻ trong list
    public static List<Integer> getNumberIsOdd(List<Integer> numbers, Predicate<Integer> predicate) {
        List<Integer> list = new ArrayList<>();
        for (Integer n : numbers) {
            if (predicate.test(n)) {
                list.add(n);
            }
        }
        return list;
    }
}
