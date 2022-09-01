package OOPStudy;
/*
* 可变个数形参的方法
*
* 格式：数据类型...变量名
*
* 实例化对象之后调用该方法可以传入任意数量的参数（包括0个）
* 可变个数形参的方法与本类中同名且形参列表不同的方法构成重载
* 可变个数形参的方法与本类中同名且形参类型相同的数组方法不构成重载，会报错
* 可变个数形参在方法的形参中，只能声明一个且一定在末尾
*
* */
public class MethodArgsTest {
    public static void main(String[] args){
        MethodArgsTest methodArgsTest = new MethodArgsTest();
        methodArgsTest.show(1,1.0,"hello", "world");
    }

    public void show(int i){

    }

    public void show(String str){
        System.out.println("确定个数的形参");
    }

    public void show(int a, double b,String ... str){
        for (int i = 0;i < str.length;i++)
            System.out.println(str[i]);
        System.out.println("可变个数的形参");
    }
}
