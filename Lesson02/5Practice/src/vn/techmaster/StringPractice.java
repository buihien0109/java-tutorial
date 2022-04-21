package vn.techmaster;

public class StringPractice {
    public static void main(String[] args) {
        String str1 = "Bùi Hiên";
        String str2 = "Bùi Hiên";
        String str3 = new String("Bùi Hiên");

        System.out.println(str1 == str2); // true
        System.out.println(str2 == str3); // false
        System.out.println(str1 == str3); // false
        System.out.println(str1.equals(str2)); // true
        System.out.println(str2.equals(str3)); // true
    }
}
