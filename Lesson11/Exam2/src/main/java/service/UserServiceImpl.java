package service;

import Util.Utils;
import exception.NotFoundException;
import model.CreateUser;
import model.User;
import repository.UserRepository;
import repository.UserRepositoryImpl;

import java.util.Random;


public class UserServiceImpl implements UserService {
    private User userCurrent = null;
    public final Random rd = new Random();
    private final UserRepository userRepository = new UserRepositoryImpl();

    @Override
    public boolean login(String username, String password) throws RuntimeException {
        User user = userRepository.findUserByUsername(username);
        System.out.println(user);

        if (user.getPassword().equals(password)) {
            userCurrent = user;
            return true;
        }
        throw new RuntimeException("Username or password not correct");
    }

    @Override
    public void logout() {
        userCurrent = null;

    }

    @Override
    public User findUserById(int id) {
        return userRepository.findUserById(id);
    }

    @Override
    public User findUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }

    @Override
    public User getUserCurrent() {
        return userCurrent;
    }

    @Override
    public void changeUserInfo(String username, String password, String email) {
        User user = userRepository.findUserById(userCurrent.getId());
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

        userRepository.save(user);
        userRepository.findAllUser().forEach(System.out::println);
    }

    @Override
    public String forgotPassword(String email) throws NotFoundException {
        User user = userRepository.findUserByEmail(email);
        return user.getPassword();
    }

    @Override
    public void changePassword(String newPassword, String oldPassword) {
        if(!userCurrent.getEmail().equals(oldPassword)) {
            throw new RuntimeException("Mật không cũ không chính xác");
        }
        if(newPassword.equals(oldPassword)) {
            throw new RuntimeException("Mật mới và mật khẩu cũ phải khác nhau");
        }
        if(Utils.validatePassword(newPassword)) {
            throw new RuntimeException("Mật khẩu mới không đúng định dạng");
        }
        userCurrent.setPassword(newPassword);
    }
}
