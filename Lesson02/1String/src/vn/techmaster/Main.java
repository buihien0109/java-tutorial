package vn.techmaster;

public class Main {

    public static void main(String[] args) {
	    // Khai báo String Literal
        String firstName = "Bùi";
        String lastName = "Hiên";

        // Khai báo string sử dụng từ khóa new
        String fullName = new String("Bùi Hiên");

        // Một số phương thức của String
        // length : Lấy độ dài của string
        System.out.println("Độ dài của chuỗi " + fullName + " là : " + fullName.length());

        // indexOf: Kiểm tra 1 chuỗi có tồn tại trong chuỗi còn lại hay không
        // Nếu có thì trả về chỉ số bắt đầu chuỗi
        // Nếu không thì trả về -1

        // Chuỗi
        System.out.println("Chỉ số của chuỗi Hi trong " + fullName + " là : " + fullName.indexOf("Hi"));
        System.out.println("Chỉ số của chuỗi Abc trong " + fullName + " là : " + fullName.indexOf("Abc"));

        // Ký tự
        System.out.println("Chỉ số của ký tự n trong " + fullName + " là : " + fullName.indexOf('n'));
        System.out.println("Chỉ số của ký tự k trong " + fullName + " là : " + fullName.indexOf('k'));

        // Substring : Cắt chuỗi từ chuỗi ban đầu
        System.out.println("Cắt chuỗi firstName: " + fullName.substring(0, 3));
        System.out.println("Cắt chuỗi lastName: " + fullName.substring(4));

        // In thường, in hoa chữ
        System.out.println("In thường chuỗi " + fullName + " là : " + fullName.toLowerCase());
        System.out.println("In hoa chuỗi " + fullName + " là : " + fullName.toUpperCase());

        // trim : Loại bỏ khoảng trống ở đầu và cuối chuỗi
        String message = "  Hà Nôi   ";
        System.out.println("Chuỗi ban đầu : " + message);
        System.out.println("Chuỗi ban đầu sau khi : " + message.trim());

        // Lấy ký tự tại vị trí được chỉ định
        String email = "hien@gmail.com";
        System.out.println("Lấy ra ký tự đầu tiên trong chuỗi " + email + " là : " + email.charAt(0));
        System.out.println("Lấy ra ký tự cuối cùng trong chuỗi " + email + " là : " + email.charAt(email.length() - 1));
        System.out.println("Lấy ra ký tự với index= 4 trong chuỗi " + email + " là : " + email.charAt(4));
        System.out.println("Lấy ra ký tự bất kỳ trong chuỗi " + email + " là : " + email.charAt(randomNumber(email)));

        // So sánh 2 chuỗi
        String str1 = "Hiên";
        String str2 = "Hiên";
        String str3 = "hiên";
        System.out.println("So sánh chuỗi " + str1 + " và " + str2 + " : " + str1.equals(str2));
        System.out.println("So sánh chuỗi " + str1 + " và " + str3 + " : " + str1.equals(str3));

        System.out.println("So sánh chuỗi " + str1 + " và " + str3 + " : " + str1.equalsIgnoreCase(str3));
    }

    public static int randomNumber(String str) {
        return (int) Math.floor(Math.random() * str.length());
    }
}
