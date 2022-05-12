package service;

import model.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class EmployeeService {
    // Tạo List danh sách nhân viên để quản lý
    private ArrayList<Employee> employees;

    // Khi khởi tạo đối tượng từ constructor --> Khởi tạo data
    public EmployeeService() {
        init();
    }

    // Chèn data cho list
    public void init() {
        employees = new ArrayList<>();
        employees.add(new Employee(1, "Nguyễn Văn A", "a@gmail.com", 6_000_000));
        employees.add(new Employee(2, "Trần Văn B", "b@gmail.com", 12_000_000));
        employees.add(new Employee(3, "Ngô Thị C", "c@gmail.com", 14_000_000));
        employees.add(new Employee(4, "Bùi Thị D", "d@gmail.com", 8_000_000));
    }

    // Trả về danh sách nhân viên
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    // In ra thông tin của list nhân viên
    public void printInfo(ArrayList<Employee> list) {
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }

    // Tạo nhân viên mới bằng cách nhập thông tin từ bàn phím
    public Employee createEmployee() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.print("Nhập tên : ");
        String name = sc.nextLine();

        System.out.print("Nhập email : ");
        String email = sc.nextLine();

        System.out.print("Nhập lương : ");
        int salary = Integer.parseInt(sc.nextLine());

        Employee employee = new Employee(rd.nextInt(100), name, email, salary);
        employees.add(employee);

        return employee;
    }

    // Tìm kiếm nhân viên theo id (id là duy nhất)
    public Employee findById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    // Tìm kiếm nhân viên theo tên
    // Có thể có nhiều nhân viên có cùng tên
    public ArrayList<Employee> findByName(String name) {
        ArrayList<Employee> list = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().toLowerCase().contains(name.toLowerCase())) {
                list.add(employee);
            }
        }
        return list;
    }

    // Xóa nhân viên theo id
    public void deleteEmployee(int id) {
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getId() == id) {
                iterator.remove();
            }
        }
    }

    // Tìm kiếm nhân viên theo khoảng lương
    public ArrayList<Employee> findBySalary(int minSalary, int maxSalary) {
        ArrayList<Employee> list = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getSalary() >= minSalary && employee.getSalary() <= maxSalary) {
                list.add(employee);
            }
        }
        return list;
    }
}
