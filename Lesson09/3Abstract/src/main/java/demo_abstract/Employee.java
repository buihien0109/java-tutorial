package demo_abstract;

// Abstract class (lớp trừu tượng) trong Java không thể được khởi tạo
// (chúng ta không thể tạo các đối tượng của lớp trừu tượng).
// Sử dụng từ khóa abstract để khai báo một lớp trừu tượng
public abstract class Employee {
    private int id;
    private String name;
    private String email;
    private int basicSalary;

    public Employee() {
    }

    public Employee(int id, String name, String email, int basicSalary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.basicSalary = basicSalary;
    }

    // Một Abstract class có thể có cả phương thức thông thường (regular method)
    // hoặc phương thức trừu tượng (abstract method)

    // Một phương thức không có phần thân (body) được gọi là một phương thức trừu tượng (abstract method).
    // Phương thức abstract để tính lương
    abstract int calculateSalary();

    // Phương thức thông thường
    public void register() {
        System.out.println("Employee register");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }
}
