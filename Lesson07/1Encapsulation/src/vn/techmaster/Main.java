package vn.techmaster;

public class Main {

    public static void main(String[] args) {
	    // Khởi tạo đối tượng person
        Person person = new Person();

        // Set các thuộc tính
        person.setId(-1);
        person.setName("Bùi Hiên");
        person.setAge(25);
        person.setEmail("hien@techmaster.vn");

        // In ra thông tin của person
        System.out.println(person);

        // =========================

        // Khởi tạo person với constructor có tham số
        Person person1 = new Person(1, "Nguyễn Thu Hằng", 30, "hang@gmail.com");

        // In ra đối tượng
        System.out.println(person1);

        // Đọc ra 1 số thông tin của person
        System.out.println(person1.getName());
        System.out.println(person1.getEmail());

        // Đặt lại 1 số thông tin
        person1.setName("Nguyễn Bích Ngọc");
        person1.setEmail("bichngoc@gmail.com");

        // In lại thông tin của đối tượng sau khi thay đổi
        System.out.println(person1);
    }
}
