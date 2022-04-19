package repository;

import model.User;

import java.util.List;

public interface UserRepository {
    void init();

    List<User> findAllUser();
    User findUserById(int id);
    User findUserByUsername(String username);
    User findUserByEmail(String email);

    void save(User user);
}
