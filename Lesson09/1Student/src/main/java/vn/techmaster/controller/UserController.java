package vn.techmaster.controller;

import vn.techmaster.model.User;
import vn.techmaster.service.UserServiceImpl;

import java.util.List;
import java.util.Scanner;

public class UserController {
    private final UserServiceImpl userService = new UserServiceImpl();

    public void run() {
        Scanner sc = new Scanner(System.in);
        boolean isQuit = false;
        while (!isQuit) {
            showMenu();

            System.out.print("Mời nhập lựa chọn : ");

            int option = 0;
            try {
                option = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ignored) {
            }

            switch (option) {
                case 1 -> {
                    try {
                        List<User> users = userService.getUsers();
                        System.out.println("Danh sách học sinh");
                        users.forEach(System.out::println);
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 2 -> {
                    System.out.print("Nhập id của học sinh muốn xem thông tin : ");
                    int id = sc.nextInt();

                    try {
                        User user = userService.getUserById(id);
                        System.out.println(user);
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 3 -> {
                    userService.addUser();
                }
                case 4 -> {
                    System.out.print("Nhập id của user muốn cập nhật điểm : ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nhập điểm mới : ");
                    double point = Double.parseDouble(sc.nextLine());
                    try {
                        userService.updatePoint(id, point);
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 5 -> {
                    System.out.print("Nhập id của học sinh muốn xóa : ");
                    int id = sc.nextInt();

                    try {
                        userService.deleteUser(id);
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 6 -> {
                    System.out.print("Nhập tên lớp muốn xem : ");
                    String classroom = sc.nextLine();

                    try {
                        List<User> users = userService.getUserByClassroom(classroom);
                        System.out.println("Danh sách học sinh của lớp " + classroom);
                        users.forEach(System.out::println);
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 7 -> {
                    try {
                        List<User> users = userService.sortUserByName();
                        System.out.println("Danh sách học sinh sắp xếp theo tên");
                        users.forEach(System.out::println);
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 8 -> {
                    try {
                        List<User> users = userService.sortUserByAge();
                        System.out.println("Danh sách học sinh sắp xếp theo tuổi");
                        users.forEach(System.out::println);
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 9 -> {
                    try {
                        List<User> users = userService.sortUserByPoint();
                        System.out.println("Danh sách học sinh sắp xếp theo điểm");
                        users.forEach(System.out::println);
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 10 -> {
                    isQuit = true;
                }
                default -> {
                    System.out.println("Lựa chọn không chính xác. Mời nhập lại");
                }
            }
        }
    }

    private void showMenu() {
        System.out.println("1 - Xem danh sách học sinh");
        System.out.println("2 - Xem thông tin học sinh");
        System.out.println("3 - Thêm học sinh mới");
        System.out.println("4 - Cập nhập điểm học sinh");
        System.out.println("5 - Xóa học sinh");
        System.out.println("6 - Xem danh sách học sinh theo lớp");
        System.out.println("7 - Sắp xếp theo tên");
        System.out.println("8 - Sắp xếp theo tuổi");
        System.out.println("9 - Sắp xếp theo điểm");
        System.out.println("10 - Thoát");
    }
}
