package repository;

import exception.NotFoundException;
import model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class UserRepositoryImpl implements UserRepository{
    private List<User> users;
    private final Random rd = new Random();

    public UserRepositoryImpl() {
        init();
    }

    @Override
    public void init() {
        users = new ArrayList<>();
        users.add(new User(rd.nextInt(100), "hien", "hien@gmail.com", "111"));
        users.add(new User(rd.nextInt(100), "an", "an@gmail.com", "111"));
        users.add(new User(rd.nextInt(100), "tuan", "tuan@gmail.com", "111"));
    }

    @Override
    public List<User> findAllUser() {
        return users;
    }

    @Override
    public User findUserById(int id) {
        Optional<User> userOptional = users
                .stream().filter(user -> user.getId() == id).findFirst();

        if (userOptional.isPresent()) {
            return userOptional.get();
        }
        throw new NotFoundException("Not found user with id = " + id);
    }

    @Override
    public User findUserByUsername(String username) {
        Optional<User> userOptional = users
                .stream().filter(user -> user.getUsename().equals(username)).findFirst();

        if (userOptional.isPresent()) {
            return userOptional.get();
        }
        throw new NotFoundException("Not found user with username = " + username);
    }

    @Override
    public User findUserByEmail(String email) {
        Optional<User> userOptional = users
                .stream().filter(user -> user.getEmail().equals(email)).findFirst();

        if (userOptional.isPresent()) {
            return userOptional.get();
        }
        throw new NotFoundException("Not found user with email = " + email);
    }

    @Override
    public void save(User user) {
        users.add(user);
    }
}
