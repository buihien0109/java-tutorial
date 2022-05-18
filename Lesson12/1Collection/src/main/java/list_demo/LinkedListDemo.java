package list_demo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Khai báo names thuộc kiểu LinkedList
        LinkedList<String> names = new LinkedList<>();

        // Thêm 1 số phần tử vào names
        names.add("Hiên");
        names.add("Thu");
        names.add("Hiên");
        names.add("Hằng");

        // In ra names
        System.out.println(names.toString());

        // ************************************
        // Duyệt list
        // 1. Sử dụng for
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + "\t");
        }
        System.out.println();

        // 2.Sử dụng forEach
        for (String name: names) {
            System.out.print(name + "\t");
        }
        System.out.println();

        // 3. Sử dụng iterator
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }
        System.out.println();

        // 4. Sử dụng list iterator
        ListIterator<String> listIterator = names.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + "\t");
        }
        System.out.println();

        // ************************************
        // Một số phương thức
        System.out.println(names.size());

        System.out.println(names.get(0));
        System.out.println(names.get(names.size() - 1));

        System.out.println(names.getFirst());
        System.out.println(names.getLast());

        names.removeFirst();
        names.removeLast();

        names.addFirst("first");
        names.addLast("last");
    }
}
