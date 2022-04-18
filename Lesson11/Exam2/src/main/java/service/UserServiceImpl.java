package service;

import exception.NotFoundException;
import model.CreateUser;
import model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;


public class UserServiceImpl implements UserService {
    private List<User> users;
    private int userIdCurrent = 0;
    public final Random rd = new Random();

    public UserServiceImpl() {
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
    public boolean login(String username, String password) throws RuntimeException {
        User user = findUserByUsername(username);

        System.out.println(user);

        if (user.getPassword().equals(password)) {
            userIdCurrent = user.getId();
            return true;
        }
        throw new RuntimeException("Username or password not correct");
    }

    @Override
    public void logout() {
        userIdCurrent = 0;
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
    public int getUserIdCurrent() {
        return userIdCurrent;
    }

    @Override
    public void changeUserInfo(String username, String password, String email) {
        User user = findUserById(userIdCurrent);
        user.setUsename(username);
        user.setEmail(email);
        user.setPassword(password);
    }

    @Override
    public void registerUser(CreateUser createUser) {
        User user = User.builder()
                .id(rd.nextInt(100))
                .usename(createUser.getUsername())
                .email(createUser.getEmail())
                .password(createUser.getPassword())
                .build();

        users.add(user);

        users.forEach(System.out::println);
    }

    @Override
    public String forgotPassword(String email) throws NotFoundException {
        User user = findUserByEmail(email);
        return user.getPassword();
    }
}
