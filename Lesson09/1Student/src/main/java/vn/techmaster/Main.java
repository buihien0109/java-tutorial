package vn.techmaster;

import vn.techmaster.controller.UserController;

public class Main {

    public static void main(String[] args) {
        UserController userController = new UserController();
        userController.run();
    }
}
