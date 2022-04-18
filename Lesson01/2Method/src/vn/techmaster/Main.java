package vn.techmaster;

public class Main {

    public static void main(String[] args) {
        // Khởi tạo đối tượng
        Main main = new Main();

        // Gọi phương thức
        main.sayHello();

        // 1 tham số
        main.sayHelloWithName("Bùi Hiên");
        main.sayHelloWithName("Minh Hằng");

        // 2 tham số
        main.sayHelloWithNameAndAge("Bùi Hiên", 25);
        main.sayHelloWithNameAndAge("Minh Hằng", 32);

        // Trả về kết quả
        int data = main.sumTwoNumber(3, 4); // 7
        int data2 = main.sumTwoNumber(data, 6); // 13

        System.out.println(data);
        System.out.println(data2);

        System.out.println(main.sumTwoNumber(10, 20));
        System.out.println(main.sumTwoNumber(10, 11));
    }

    public void sayHello() {
        System.out.println("Xin chào các bạn");
    }

    public void sayHelloWithName(String name) {
        System.out.println("Xin chào " + name);
    }

    public void sayHelloWithNameAndAge(String name, int age) {
        System.out.println("Tôi tên là " + name + ". Năm nay tôi " + age + " tuổi");
    }

    public int sumTwoNumber(int a, int b) {
        return a + b;
    }

    public int getMyAge() {
        return 25;
    }
}
