package OOPStudy;
/*
* 类中方法的声明和使用
*
* 方法：描述类应具有的功能
* 比如Math：sqrt()、random()  Scanner：nextInt()  Arrays：sort()、binarySearch()
*
* 1、方法的声明
*       权限修饰符 返回值类型 方法名（形参列表）{
*           方法体
*       }
*   1.1 权限修饰符：private、public、缺省、protected -->封装性
*   1.2 返回值类型：
*           有返回值：如果方法有返回值，则必须在方法声明时指定返回值类型，同时需要return关键字返回指定类型
*           无返回值：方法声明时返回值类型为void，通常不需要return，若使用的话只能用”return;“
*   1.3 属于标识符，要符合规范且简明易懂
*   1.4 形参列表：方法可以声明0到多个形参
*   1.5 方法体：方法功能的体现
*
* */
public class CustomerTest {
}
//客户类
class Customer{
//    属性
    String name;
    int age;
    boolean isMale;
//    方法
    public void eat(){
        System.out.println("客户吃饭");
    }
    public void sleep(int time){
        System.out.println("客户在" + time + "睡觉");
    }
    public String getname(){
        return name;
    }
    public String getname(String nation){
        String info = "国籍是" + nation;
        return info;
    }
}
