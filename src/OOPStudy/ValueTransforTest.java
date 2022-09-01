package OOPStudy;
/*
*方法的形参值传递机制
*
* 形参：方法定义时小括号内的参数列表
* 实参：方法调用时，实际传递的参数
*
* 值传递机制：
* 如果参数是基本数据类型，此时实参赋给形参的值是实参的真实存储的数据值
* 如果参数是引用数据类型，此时实参赋给形参的值是实参存储数据的地址值
*
* */
public class ValueTransforTest {
    public static void main(String[] args){
        ValueTransforTest valueTransforTest = new ValueTransforTest();
        int m = 10;
        int n = 20;
        valueTransforTest.swap(m,n);
        System.out.println(m + " " + n);
    }

    public void swap(int m, int n){
        int temp = m;
        m = n;
        n = temp;
    }

}
