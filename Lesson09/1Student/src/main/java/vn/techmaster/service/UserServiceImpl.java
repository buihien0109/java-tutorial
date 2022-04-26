package vn.techmaster.service;

import vn.techmaster.model.User;

import java.util.*;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {
    private final List<User> users = new ArrayList<>();
    private final Random rd = new Random();
    private final Scanner sc = new Scanner(System.in);

    public UserServiceImpl() {
        init();
    }

    @Override
    public void init() {
        users.add(new User(rd.nextInt(1000), "Bui Hien", 24, "Thai Binh", 9.3, "10a1"));
        users.add(new User(rd.nextInt(1000), "Thu Hang", 22, "Hung Yen", 6.6, "10a2"));
        users.add(new User(rd.nextInt(1000), "Minh Duy", 27, "Thai Nguyen", 9.7, "10a3"));
        users.add(new User(rd.nextInt(1000), "Cam Tu", 21, "Ha Noi", 8.6, "10a4"));
        users.add(new User(rd.nextInt(1000), "Phuong Loan", 18, "Thai Binh", 9.9, "10a1"));
        users.add(new User(rd.nextInt(1000), "Kim Ngan", 22, "Ha Noi", 9.1, "10a2"));
        users.add(new User(rd.nextInt(1000), "Bui Hoa", 25, "Thai Binh", 9.3, "10a3"));
        users.add(new User(rd.nextInt(1000), "Bich Ngoc", 27, "Hai Phong", 5.3, "10a1"));
        users.add(new User(rd.nextInt(1000), "Hong Ngoc", 23, "Ha Noi", 8.9, "10a2"));
        users.add(new User(rd.nextInt(1000), "Pham Man", 22, "Thai Binh", 9.0, "10a2"));
    }

    @Override
    public List<User> getUsers() {
        if (!users.isEmpty()) {
            return users;
        }
        throw new RuntimeException("Danh sách user trống!");
    }

    @Override
    public User getUserById(int id) {
        Optional<User> userOptional = users.stream().filter(user -> user.getId() == id).findFirst();
        if (userOptional.isPresent()) {
            return userOptional.get();
        }
        throw new RuntimeException("Không tìm thấy user có id = " + id);
    }

    @Override
    public void addUser() {
        System.out.print("Nhập tên : ");
        String name = sc.nextLine();

        System.out.print("Nhập tuổi : ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập địa chỉ : ");
        String address = sc.nextLine();

        System.out.print("Nhập điểm : ");
        double point = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập lớp");
        String classroom = sc.nextLine();

        User user = new User(rd.nextInt(1000), name, age, address, point, classroom);
        users.add(user);
    }

    @Override
    public void deleteUser(int id) {
        Optional<User> userOptional = users.stream().filter(user -> user.getId() == id).findFirst();
        if (userOptional.isEmpty()) {
            throw new RuntimeException("Không tìm thấy user có id = " + id);
        }
        users.remove(userOptional.get());
    }

    @Override
    public List<User> getUserByClassroom(String classroom) {
        List<User> usersOfClassroom = users
                .stream()
                .filter(user -> user.getClassroom().equals(classroom)).toList();

        if (!usersOfClassroom.isEmpty()) {
            return usersOfClassroom;
        }
        throw new RuntimeException("Không có học viên nào trong lớp : " + classroom);
    }

    @Override
    public void updatePoint(int id, double point) {
        Optional<User> userOptional = users.stream().filter(user -> user.getId() == id).findFirst();
        if (userOptional.isEmpty()) {
            throw new RuntimeException("Không tìm thấy user có id = " + id);
        }
        if (point < 0.0 || point > 10.0) {
            throw new RuntimeException("Giá trị point không chính xác");
        }

        userOptional.get().setPoint(point);
    }


    @Override
    public List<User> sortUserByName() {
        if (!users.isEmpty()) {
            return users.stream().sorted(Comparator.comparing(User::getName)).collect(Collectors.toList());
        }
        throw new RuntimeException("Danh sách user trống!");
    }

    @Override
    public List<User> sortUserByAge() {
        if (!users.isEmpty()) {
            return users.stream().sorted(Comparator.comparing(User::getAge)).collect(Collectors.toList());
        }
        throw new RuntimeException("Danh sách user trống!");
    }

    @Override
    public List<User> sortUserByPoint() {
        if (!users.isEmpty()) {
            return users.stream().sorted(Comparator.comparing(User::getPoint)).collect(Collectors.toList());
        }
        throw new RuntimeException("Danh sách user trống!");
    }
}
