package AboutGenerics;

/**
 * T：任意类型的type
 * K：key-value的key
 * V：key-value的value
 * E：集合中的元素类型element
 */
public class GenericsClassTest {
    public static void main(String[] args) {
        Generics<String> generics = new Generics<>("泛型测试");
        System.out.println(generics.getValue());
        Generics<Integer> generics1 = new Generics<>(111);
        System.out.println(generics1.getValue());
        Generics<String> generics2 = new Generics<>();
        generics2.setValue("泛型测试2");
        System.out.println(generics2.getValue());
    }
}

class Generics<T>{
    private T value;
    public Generics(){}
    public Generics(T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}