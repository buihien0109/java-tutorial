package demo_collections;

import java.util.*;

public class DemoCollections {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 5, 6, 1, 7);

        // Đổi chỗ ngẫu nhiên các phần tử trong list
        Collections.shuffle(numbers);
        System.out.println(numbers.toString());

        // Sắp xếp tăng dần
        Collections.sort(numbers);
        System.out.println(numbers.toString());

        // Sắp xếp giảm dần
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1 > 0 ? 1 : -1;
            }
        });
        System.out.println(numbers.toString());

        // Lấy giá trị lớn nhất trong list
        int max = Collections.max(numbers);
        System.out.println(max);

        // Lấy giá trị nhỏ nhất trong list
        int min = Collections.min(numbers);
        System.out.println(min);

        // Đảo ngược vị trí của phần tử trong list
        Collections.reverse(numbers);
        System.out.println(numbers.toString());

        // Sắp xếp giảm dần
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers.toString());

        // Thay thế giá trị
        Collections.replaceAll(numbers, 2, 4);
        System.out.println(numbers.toString());

        // Copy ra 1 giá trị khác
        List<Integer> source = Arrays.asList(11, 22, 33);
        List<Integer> destination = new ArrayList<>(source);
        System.out.println(destination.toString());

        // Fill toàn bộ giá trị = 1 giá trị khác
        Collections.fill(destination, 10);
        System.out.println(destination.toString());
    }
}
