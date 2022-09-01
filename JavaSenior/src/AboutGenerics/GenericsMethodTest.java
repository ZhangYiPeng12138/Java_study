package AboutGenerics;

/**
 * @BelongsProject: Java_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-08-16  14:40
 * @Description: TODO
 * @Version: 1.0
 */
public class GenericsMethodTest {
    public static void main(String[] args) {
        MethodClass m1 = new MethodClass();
        m1.method("泛型测试");
        m1.method(123);
    }
}

class MethodClass{
    public <T>T method(T value){
        System.out.println(value.getClass());
        System.out.println(value);
        return value;
    }
}