package demo_class;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MyClass<T>{
    private T obj;

    // Demo Generic method
    public void demoMethod(T data) {
        System.out.println("Demo Generic method");
        System.out.println("Data : " + data);
    }

    public <U extends Number> void demoMethod1(U data) {
        System.out.println("Demo Generic method with parameter of Number");
        System.out.println("Data : " + data);
    }
}
