package vn.techmaster;

import java.util.Arrays;

enum Role {
    ADMIN, USER, SALE
}

public class Enum {
    enum weekDay {
        MONDAY, TUESDAY, SUNDAY
    }
    public static void main(String[] args) {
        // Định nghĩa bên trong class;
        System.out.println("Hôm nay là thứ " + weekDay.MONDAY);
        System.out.println("Đi nhậu vào hôm " + weekDay.SUNDAY);

        // Định nghĩa bên ngoài class
        Role adminRole = Role.ADMIN;
        System.out.println(adminRole);

        Role userRole = Role.USER;
        System.out.println(userRole);

        Role saleRole = Role.SALE;
        System.out.println(saleRole);

        System.out.println(((Object)adminRole).getClass().getName());

        System.out.println("Nhân viên bán hàng thì có quyền " + saleRole);

        // Định nghĩa trong 1 file riêng biệt
        System.out.println("Mùa nóng nhất trong năm là mùa " + Season.SUMMER);
        System.out.println("Mùa lạnh nhất trong năm là mùa " + Season.WINTER);
        System.out.println(Season.valueOf("AUTUMN"));
    }
}
