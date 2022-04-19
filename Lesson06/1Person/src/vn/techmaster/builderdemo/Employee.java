package vn.techmaster.builderdemo;

public class Employee {
    private int id;
    private String name;
    private String email;
    private int salary;

    public Employee() {
    }

    public Employee(int id, String name, String email, int salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public static Employee builder() {
        return new Employee();
    }

    public Employee withName(String name) {
        this.name = name;
        return this;
    }

    public Employee withId(int id) {
        this.id = id;
        return this;
    }

    public Employee withEmail(String email) {
        this.email = email;
        return this;
    }

    public Employee withSalary(int salary) {
        this.salary = salary;
        return this;
    }

    public Employee build() {
        return new Employee(id, name, email, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }
}
