import java.util.Optional;

public class DemoOptional {
    public static void main(String[] args) {
        // Tạo đối tượng Optional
        // 1. Tạo optional rỗng
        Optional<String> optionalEmpty = Optional.empty();
        System.out.println(optionalEmpty);

        // 2. Tạo optional chưa giá trị khác null;
        Optional<String> optionalS = Optional.of("Hello");
        System.out.println(optionalS);

        // 3. Tạo một đối tượng Optional chứa giá trị cụ thể
        // hoặc giá trị rỗng (empty) nếu tham số là null:
        Optional<Integer> optionalInteger = Optional.ofNullable(1);
        Optional<Integer> optionalInteger1 = Optional.ofNullable(null);

        System.out.println(optionalInteger);
        System.out.println(optionalInteger1);
    }
}
