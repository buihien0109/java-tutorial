package demo_set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);
        numbers.add(3);
        numbers.add(4);

        // In ra numbers;
        for (int n: numbers) {
            System.out.print(n + "\t");
        }
        System.out.println();

        Set<Integer> numbers1 = new TreeSet<>();
        numbers1.add(2);
        numbers1.add(4);
        numbers1.add(1);
        numbers1.add(3);
        numbers1.add(4);

        for (int n: numbers1) {
            System.out.print(n + "\t");
        }
        System.out.println();

        System.out.println(numbers.hashCode());
    }
}
