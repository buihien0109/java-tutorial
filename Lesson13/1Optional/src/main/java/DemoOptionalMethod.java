import java.util.Optional;

public class DemoOptionalMethod {
    public static void main(String[] args) {
        // Khởi tạo đối tượng optional
        // 1. optional rỗng
        Optional<String> optionalEmpty = Optional.empty();

        // 2. optional có giá trị
        Optional<String> optionalS = Optional.of("Hello");

        // ************** Một số phương thức **************
        // get() : Lấy ra giá trị trong optional
        // isPresent() và ifPresent() : kiểm tra có giá trị hay không
        if (optionalS.isPresent()) {
            System.out.println("Giá trị là : " + optionalS.get());
        } else {
            System.out.println("Không có giá trị");
        }

        if (optionalEmpty.isPresent()) {
            System.out.println("Giá trị là : " + optionalS.get());
        } else {
            System.out.println("Không có giá trị");
        }

        // Hoặc sử dụng ifPresent() + kết hợp với Lambda
        optionalS.ifPresent(s -> System.out.println("Giá trị là : " + s));

        // ****************************
        // Sử dụng orElse()
        // Trả về giá trị của đối tượng Optional nếu nó không rỗng
        // Nếu rỗng ->  trả về giá trị mặc định được truyền vào.
        String value = optionalS.orElse("Hi");
        System.out.println(value);

        String value1 = optionalEmpty.orElse("Default value");
        System.out.println(value1);

        // orElseGet
        // Chỉ được gọi khi đối tượng Optional là rỗng.
        String value3 = optionalS.orElseGet(() -> "Hi other");
        System.out.println(value3);

        String value4 = optionalEmpty.orElseGet(() -> "Default value other");
        System.out.println(value4);

        // orElseThrow
        // Nếu Optional có giá trị tồn tại -> trả về giá trị đó
        // Ngược lại --> ném ra một Exception do chúng ta định nghĩa
        String value5 = optionalS.orElseThrow(() -> {
            throw new RuntimeException("Lỗi xảy ra");
        });
        System.out.println(value5);

        try {
            String value6 = optionalEmpty.orElseThrow(() -> {
                throw new RuntimeException("Lỗi xảy ra");
            });
            System.out.println(value6);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
