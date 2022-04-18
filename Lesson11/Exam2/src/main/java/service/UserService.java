package service;

import model.CreateUser;
import model.User;

public interface UserService {
    void init();

    boolean login(String username, String password);
    void logout();

    User findUserById(int id);
    User findUserByUsername(String username);
    User findUserByEmail(String email);
    int getUserIdCurrent();

    void changeUserInfo(String username, String password, String email);

    void registerUser(CreateUser createUser);
    String forgotPassword(String email);
}
