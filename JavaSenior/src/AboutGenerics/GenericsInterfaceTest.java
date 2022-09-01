package AboutGenerics;

/**
 * @BelongsProject: Java_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-08-16  14:30
 * @Description: TODO
 * @Version: 1.0
 */
public class GenericsInterfaceTest {
    public static void main(String[] args) {
        GenericsInterface t1 = new InterfaceImpl1();
        t1.show("泛型测试");
        GenericsInterface<Integer> t2 = new InterfaceImpl2();
        t2.show(123);
        GenericsInterface<String> t3 = new InterfaceImpl1();
    }
}

interface GenericsInterface<T>{
    void show(T value);
}

class InterfaceImpl1 implements GenericsInterface<String>{
    @Override
    public void show(String value) {
        System.out.println(value);
    }
}

class InterfaceImpl2 implements GenericsInterface<Integer>{
    @Override
    public void show(Integer value) {
        System.out.println(value);
    }
}
