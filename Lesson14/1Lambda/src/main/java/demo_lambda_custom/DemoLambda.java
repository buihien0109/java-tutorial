package demo_lambda_custom;

@FunctionalInterface
interface Hello {
    void sayHello();
}

public class DemoLambda {
    public static void main(String[] args) throws Exception {
        // Triển khai với lambda
        Hello h = () -> {
            System.out.println("Xin chào các bạn");
        };

        h.sayHello();

        // Truyền khai không với lambda (sử dụng anonymous class)
        Hello h1 = new Hello() {
            @Override
            public void sayHello() {
                System.out.println("Xin chào các bạn");
            }
        };
        h1.sayHello();

        // Truyền khai không với lambda (sử dụng class implement)
        Hello h2 = new Demo();
        h2.sayHello();
    }
}

// Khai báo class implement interface "Hello"
class Demo implements Hello {
    @Override
    public void sayHello() {
        System.out.println("Xin chào các bạn");
    }
}
