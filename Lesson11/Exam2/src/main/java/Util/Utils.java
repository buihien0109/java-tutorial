package Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
    public static boolean validateEmail(String email) {
        String regex = "^(.+)@(.+)$";
        return Pattern.compile(regex)
                .matcher(email)
                .matches();
    }

    // TODO : Hiện tại đang validate password đơn giản
    // TODO : Cần làm theo yêu cầu của đề bài (password dài từ 7 đến 15 ký tự,
    //  chứa ít nhất 1 ký tự in hoa, 1 ký tự đặc biệt (. , - _ 😉)
    public static boolean validatePassword(String password) {
        return password.length() > 4;
    }
}
