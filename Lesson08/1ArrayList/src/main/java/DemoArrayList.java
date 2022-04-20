import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class DemoArrayList {
    public static void main(String[] args) {
        // Khởi tạo array list
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        // In ra array list
        // 1. Sử dụng for binh thường
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // 2. Sử dụng forEach
        for (int number: numbers) {
            System.out.println(number);
        }

        // 3. Sử dụng iterator
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 4. Sử dụng list
        ListIterator<Integer> listIterator = numbers.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // 5. Sử dụng forEach + lambda
        numbers.forEach(number -> System.out.println(number));

        // 6. Sử dụng forEach + method reference
        numbers.forEach(System.out::println);

        // Khai báo arraylist với capacity
        // Nguồn tham khảo : https://shareprogramming.net/phan-biet-giua-capacity-cua-arraylist-voi-size-cua-array/
        ArrayList<Integer> ages = new ArrayList<>(4);
        ages.add(20);
        ages.add(30);
        ages.add(40);
        ages.add(50);

        for (int age: ages) {
            System.out.println(age);
        }
    }
}
