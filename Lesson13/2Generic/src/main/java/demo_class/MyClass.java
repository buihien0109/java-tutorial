package demo_class;

public class MyClass<T>{
    private T obj;

    public MyClass() {
    }

    public MyClass(T obj) {
        this.obj = obj;
    }

    // Demo Generic method
    public void demoMethod(T data) {
        System.out.println("Demo Generic method");
        System.out.println("Data : " + data);
    }

    public <U extends Number> void demoMethod1(U data) {
        System.out.println("Demo Generic method with parameter of Number");
        System.out.println("Data : " + data);
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
