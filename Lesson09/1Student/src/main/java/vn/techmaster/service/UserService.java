package vn.techmaster.service;

import vn.techmaster.model.User;

import java.util.List;

public interface UserService {
    void init();

    List<User> getUsers();

    User getUserById(int id);

    void addUser();

    void deleteUser(int id);

    List<User> getUserByClassroom(String classroom);

    void updatePoint(int id, double point);

    List<User> sortUserByName();

    List<User> sortUserByAge();

    List<User> sortUserByPoint();
}
