package demo_class;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

interface InterfaceGeneric<T extends Number> {
    void add(T obj);

    void remove(T obj);

    void print();
}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClassGeneric<T extends Number> implements InterfaceGeneric<T> {
    private List<T> list;

    @Override
    public void add(T obj) {
        this.list.add(obj);
    }

    @Override
    public void remove(T obj) {
        this.list.remove(obj);
    }

    @Override
    public void print() {
        for (T obj : list) {
            System.out.print(obj + "\t");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        // List Interger
        InterfaceGeneric<Integer> list = new ClassGeneric<>(new ArrayList<>());

        // Thêm 1 số phần tử vào list
        list.add(1);
        list.add(2);
        list.add(7);
        list.print();

        // Xóa phần tủ trong list
        list.remove(7);
        list.print();
    }
}
