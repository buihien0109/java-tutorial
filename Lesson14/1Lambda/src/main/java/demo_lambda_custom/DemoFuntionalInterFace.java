package demo_lambda_custom;

@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

// Triển khai interface sử dụng class inplement
public class DemoFuntionalInterFace implements Greeting{
    public static void main(String[] args) {
        Greeting g = new DemoFuntionalInterFace();
        g.sayHello("Bùi Hiên");

        // Triển khai interface anonymous class
        Greeting g1 = new Greeting() {
            @Override
            public void sayHello(String name) {
                System.out.println("Xin chào " + name);
            }
        };

        g1.sayHello("Thu Hằng");
    }


    @Override
    public void sayHello(String name) {
        System.out.println("Xin chào " + name);
    }
}
