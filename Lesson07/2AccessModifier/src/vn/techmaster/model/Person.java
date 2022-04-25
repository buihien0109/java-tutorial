package vn.techmaster.model;

public class Person {
    // Khai báo private thì chỉ được truy xuất bên trong class nơi nó khai báo
    private String name;
    private int age;

    // Nếu không có từ khóa --> default : Trong lớp và trong package
    String email;

    // Public --> Truy xuất ở bất kỳ file nào, package nào
    public String address;

    // Protected : Trong lớp, trong package, ngoài package nhưng chỉ đối với class được kế thừa
    protected int salary;

    // Hàm khởi tạo
    public Person() {
    }

    public Person(String name, int age, String email, String address, int salary) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Xin chào các bạn, tôi tên là " + name + ". Năm nay tôi " + age + " tuổi.");
    }

    protected void sayHello() {
        System.out.println("Xin chào các bạn");
    }

    public static void main(String[] args) {
        Person person = new Person("Bùi Hiên", 25, "hien@gmail.com", "Thái Bình", 10_000_000);

        // Trong cùng 1 class thì có thể truy cập vào tất cả các thuộc tính của đối tượng
        System.out.println("Name : " + person.name);
        System.out.println("Age : " + person.age);
        System.out.println("Email : " + person.email);
        System.out.println("Address : " + person.address);
        System.out.println("Salary : " + person.salary);

        person.display();
    }
}
