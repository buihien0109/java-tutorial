package controller;

import model.Employee;
import service.EmployeeService;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeController {
    private final EmployeeService employeeService = new EmployeeService();

    public void run() {
        Scanner sc = new Scanner(System.in);

        boolean isContinue = true;
        int option = 0;

        while (isContinue) {
            printMenu();

            System.out.print("Mời nhập lựa chọn : ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1: {
                    ArrayList<Employee> employees = employeeService.getEmployees();
                    if (employees.isEmpty()) {
                        System.out.println("Không có nhân viên nào trong danh sách");
                    } else {
                        employeeService.printInfo(employees);
                    }
                    break;
                }
                case 2: {
                    Employee employee = employeeService.createEmployee();
                    System.out.println("Nhân viên vừa được thêm :");
                    System.out.println(employee);
                    break;
                }
                case 3: {
                    System.out.print("Nhập tên : ");
                    String name = sc.nextLine();

                    ArrayList<Employee> employees = employeeService.findByName(name);
                    if (employees.isEmpty()) {
                        System.out.println("Không có nhân viên nào trong danh sách");
                    } else {
                        System.out.println("Nhân viên có tên " + name + " bao gồm:");
                        employeeService.printInfo(employees);
                    }
                    break;
                }
                case 4: {
                    System.out.print("Nhập id : ");
                    int id = Integer.parseInt(sc.nextLine());

                    Employee employee = employeeService.findById(id);
                    if (employee == null) {
                        System.out.println("Không có nhân viên nào có id = " + id);
                    } else {
                        System.out.println("Nhân viên có id = " + id + " là: ");
                        System.out.println(employee);
                    }
                    break;
                }
                case 5: {
                    System.out.print("Nhập id : ");
                    int id = Integer.parseInt(sc.nextLine());

                    Employee employee = employeeService.findById(id);
                    if (employee == null) {
                        System.out.println("Không có nhân viên nào có id = " + id);
                    } else {
                        employeeService.deleteEmployee(id);
                        System.out.println("Xóa thành công nhân viên có id = " + id);
                    }
                    break;
                }
                case 6: {
                    ArrayList<Employee> employees = employeeService.findBySalary(5_000_000, 10_000_000);
                    if (employees.isEmpty()) {
                        System.out.println("Không có nhân viên có mức lương từ 5.000.000 -> 10.000.000");
                    } else {
                        System.out.println("Nhân viên có mức lương từ 5.000.000 -> 10.000.000 bao gồm:");
                        employeeService.printInfo(employees);
                    }
                    break;
                }
                case 7: {
                    isContinue = false;
                    break;
                }
                default: {
                    System.out.println("Lựa chọn không phù hợp");
                    break;
                }
            }
        }
    }

    public void printMenu() {
        System.out.println("*********** MENU ***********");
        System.out.println("1. In thông tin của tất cả nhân viên");
        System.out.println("2. Thêm nhân viên mới");
        System.out.println("3. Tìm kiếm nhân viên theo tên");
        System.out.println("4. Tìm kiếm nhân viên theo id");
        System.out.println("5. Xóa nhân viên theo id");
        System.out.println("6. Tìm kiếm nhân viên có mức lương từ 5.000.000 -> 10.000.000");
        System.out.println("7. Thoát");
    }
}
