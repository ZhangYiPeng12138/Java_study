package OOPStudy;
/*
*类中属性的使用
*
* 属性（成员变量） vs 局部变量
* 1、相同点
*   1、格式相同
*   2、先声明后使用
*   3、都有对应的作用域
* 2、不同点
*   1.在类中的声明地方不同
*       属性：直接定义在类的{}中
*       局部变量：声明在方法中、方法形参、代码块内、构造器形参、构造器内的变量
*   2、关于权限修饰符的不同
*       属性：可在声明属性时，声明权限修饰符（private、public、缺省、protected）-->封装性
*       局部变量：不可以使用权限修饰符
*   3、默认初始化值
*       属性：类的属性根据其类型都有初始化值
*       局部变量：没有默认初始化值，意味着在调用局部变量时必须显式赋值
*               特别的：形参在调用时赋值即可
*   4、在内存中加载的位置
*       属性：加载在堆空间中（非static）
*       局部变量：加载在栈空间中
* */
public class UserTest {
    User user = new User();

}

class User{
//    属性（成员变量）
    String name;
    int age;
    boolean isMale;

    public void talk(String language){//language：方法形参

    }

    public void eat(){
        String noodle;//方法中
    }

}
