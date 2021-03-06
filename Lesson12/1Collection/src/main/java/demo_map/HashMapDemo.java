package demo_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hiên");
        map.put(2, "An");
        map.put(3, "Ngọc");
        map.put(4, "Dũng");

        // In ra map
        map.forEach((key, value) -> System.out.println(key + " - " + value));
        System.out.println();

        Set<Integer> keySet = map.keySet(); // Lấy danh sách key
        for (Integer key : keySet) {
            System.out.println(key + " - " + map.get(key));
        }
        System.out.println();

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> e : entries) {
            System.out.println(e.getKey() + " - " + e.getValue());
        }
        System.out.println();

        // Lấy value theo key
        System.out.println(map.get(1));

        // Lấy ra độ dài
        System.out.println(map.size());

        // Kiểm tra 1 key có tồn tại trong hashmap hay không
        System.out.println(map.containsKey(1));

        // Kiểm tra 1 value có tồn tại trong hashmap không
        System.out.println(map.containsValue("An"));

        // Thêm 1 collection khác vào trong map
        Map<Integer, String> mapOther = new HashMap<>();
        mapOther.put(5, "Vinh");
        mapOther.put(6, "Minh");
        map.putAll(mapOther);

        // *********************************
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Hiên");
        hashMap.put(2, "An");
        hashMap.put(3, "Ngọc");
        hashMap.put(4, "Dũng");

        // Kiểm tra 1 key có tồn tại trong hashmap hay không
        System.out.println(hashMap.containsKey(1));

        // Kiểm tra 1 value có tồn tại trong hashmap không
        System.out.println(hashMap.containsValue("An"));

        // *********************************
        Map<Student, Integer> studentMap = new HashMap<>();
        studentMap.put(new Student(1, "Hiên", "hien@gmail.com"), 1);
        studentMap.put(new Student(2, "Hiên", "hien@gmail.com"), 2);
        studentMap.put(new Student(2, "An", "an@gmail.com"), 3);
        studentMap.put(new Student(3, "Vinh", "vinh@gmail.com"), 4);

        System.out.println("Test hashmap student");
        Set<Student> keySet1 = studentMap.keySet(); // Lấy danh sách key
        for (Student key : keySet1) {
            System.out.println(key + " - " + studentMap.get(key));
        }
    }
}
