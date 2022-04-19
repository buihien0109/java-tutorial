package service;

import model.CreateUser;
import model.User;

public interface UserService {
    boolean login(String username, String password);
    void logout();

    User getUserCurrent();
    User findUserById(int id);
    User findUserByUsername(String username);
    void changeUserInfo(String username, String password, String email);

    void registerUser(CreateUser createUser);
    String forgotPassword(String email);
    void changePassword(String newPassword, String oldPassword);
}
