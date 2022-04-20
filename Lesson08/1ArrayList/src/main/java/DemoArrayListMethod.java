import java.util.ArrayList;
import java.util.Arrays;

public class DemoArrayListMethod {
    public static void main(String[] args) {
        // Khởi tạo array list
        ArrayList<String> students = new ArrayList<>();

        // add( Object o) : Thêm 1 phần tử vào cuối arraylist
        students.add("hiên");
        students.add("an");
        students.add("huy");
        students.add("duy");
        System.out.println(Arrays.toString(students.toArray())); // [hiên, an, huy, duy]

        // int size() : Lấy độ dài của array list
        System.out.println(students.size()); // 4

        // add(int index, Object o) : Thêm 1 phần tử vào vị trí được chỉ định
        students.add(2, "ngọc");
        System.out.println(Arrays.toString(students.toArray())); // [hiên, an, ngọc, huy, duy]

        // remove(int index) : Xóa phần tử tại vị trí chỉ định
        students.remove(2);
        System.out.println(Arrays.toString(students.toArray())); // [hiên, an, huy, duy]

        // remove(Object o) : Xóa object được chỉ định
        students.remove("duy");
        System.out.println(Arrays.toString(students.toArray())); // [hiên, an, huy]

        // set(int index, Object o): Thay đổi giá trị của phần tử được chỉ định theo chỉ số
        students.set(0, "loan");
        System.out.println(Arrays.toString(students.toArray())); // [loan, an, huy]

        // boolean contains(Object o) : Kiểm tra 1 giá trị có tồn tại trong array list hay không
        System.out.println(students.contains("loan")); // true
        System.out.println(students.contains("hiên")); // false

        // int indexOf(Object o): Kiểm tra 1 giá trị có nằm trong arraylist hay không
        // Nếu có thì trả về chỉ số
        // Nếu không có thì trả về -1
        System.out.println(students.indexOf("loan"));
        System.out.println(students.indexOf("hiên"));
    }
}
