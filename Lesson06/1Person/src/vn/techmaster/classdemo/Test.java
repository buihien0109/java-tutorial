package vn.techmaster.classdemo;

public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng person
        Person person = new Person();

        // Khởi tạo thuộc tính cho person
        person.name = "Bùi Hiên";
        person.age = 25;
        person.address = "Thái Bình";

        // In ra thông tin của đối tượng person
        System.out.println(person.name + " - " + person.age + " - " + person.address);

        // Thay đổi tượng tính của person
        person.address = "Hà Nội";

        // Sử dụng toString đã được overide để hiển thị thông tin của person
        // System.out.println(person);
        // Hoặc
        System.out.println(person.toString());

        // Khởi tạo đối tượng với các constructor khác nhau
        Person person1 = new Person("Nguyễn Văn A");
        person1.age = 30;
        person1.address = "Thành phố Hồ Chí Minh";
        System.out.println(person1.toString());

        // Bài tập : Khởi tạo đối tượng person với 2 tham số và full tham số

        // Phương thức
        Person person2 = new Person("Ngô B", 18, "Hải Phòng");
        person2.play();
        person.eat("phở");
        System.out.println(person2.name + " sinh năm " + person2.getYearOfBirth());
    }
}
