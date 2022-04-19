package controller;

import Util.Utils;
import model.CreateUser;
import model.User;
import service.UserService;
import service.UserServiceImpl;

import java.util.Scanner;

public class UserController {
    private final UserService userService = new UserServiceImpl();
    private final Scanner sc = new Scanner(System.in);

    public void run() {
        handleLoginMenu();
        handleUserMenu();
    }

    private void handleLoginMenu() {
        boolean isQuit = false;
        int option = 0;

        while (!isQuit) {
            showLoginMenu();

            System.out.print("Mời nhập lựa chọn : ");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1 -> {
                    System.out.print("Nhập username : ");
                    String username = sc.nextLine();

                    System.out.print("Nhập password : ");
                    String password = sc.nextLine();

                    try {
                        isQuit = userService.login(username, password);
                        System.out.println("--> Đăng nhập thành công");
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 2 -> {
                    // Nhập username
                    String username = "";
                    do {
                        System.out.print("Nhập username : ");
                        username = sc.nextLine();

                        if (username.equals("")) {
                            System.out.println("--> username không được để trống");
                        }
                    } while (username.equals(""));

                    // Nhập password
                    String password = "";
                    do {
                        System.out.print("Nhập password : ");
                        password = sc.nextLine();

                        if (password.equals("")) {
                            System.out.println("--> password không được để trống");
                        } else if (!Utils.validatePassword(password)) {
                            System.out.println("--> password không đúng định dạng");
                        }
                    } while (password.equals("") || !Utils.validatePassword(password));

                    // Nhập email
                    String email = "";
                    do {
                        System.out.print("Nhập email : ");
                        email = sc.nextLine();

                        if (email.equals("")) {
                            System.out.println("--> email không được để trống");
                        } else if (!Utils.validateEmail(email)) {
                            System.out.println("--> email không đúng định dạng");
                        }
                    } while (email.equals("") || !Utils.validateEmail(email));


                    CreateUser createUser = new CreateUser(username, password, email);
                    userService.registerUser(createUser);
                    System.out.println("--> Đăng ký thành công");
                }
                case 3 -> {
                    System.out.print("Nhập email : ");
                    String email = sc.nextLine();

                    try {
                        String password = userService.forgotPassword(email);
                        System.out.println("--> Mật khẩu của bạn là : " + password);
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                }
                default -> {
                    System.out.println("Lựa chọn không chính xác");
                }
            }
        }
    }

    private void handleUserMenu() {
        User userCurrent = userService.findUserById(userService.getUserCurrent().getId());

        boolean isQuit = false;
        int option = 0;
        while (!isQuit) {
            showUserMenu(userCurrent.getUsename());

            System.out.print("Mời nhập lựa chọn : ");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1 -> {
                    System.out.print("Nhập username mới : ");
                    String username = sc.nextLine();

                    userService.changeUserInfo(username, userCurrent.getPassword(), userCurrent.getEmail());
                }
                case 2 -> {
                    System.out.print("Nhập email mới : ");
                    String email = sc.nextLine();

                    userService.changeUserInfo(userCurrent.getUsename(), userCurrent.getPassword(), email);
                }
                case 3 -> {
                    System.out.print("Nhập password mới : ");
                    String password = sc.nextLine();

                    userService.changeUserInfo(userCurrent.getUsename(), password, userCurrent.getEmail());
                }
                case 4 -> {
                    userService.logout();
                    System.out.println("Đăng xuất thành công");
                    run();
                }
                case 5 -> {
                    isQuit = true;
                }
                default -> {
                    System.out.println("Lựa chọn không chính xác");
                }
            }
        }
    }

    private void showLoginMenu() {
        System.out.println("1 - Đăng nhập");
        System.out.println("2 - Đăng ký");
        System.out.println("3 - Quên mật khẩu");
    }

    private void showUserMenu(String username) {
        System.out.println("Xin chào " + username + ". Mời chọn menu");
        System.out.println("1 - Thay đổi username");
        System.out.println("2 - Thay đổi email");
        System.out.println("3 - Thay đổi mật khẩu");
        System.out.println("4 - Đăng xuất");
        System.out.println("5 - Thoát");
    }
}
