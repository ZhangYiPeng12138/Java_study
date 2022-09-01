package OOPStudy_Interface;

/**
 * 接口的使用：
 * 1、接口使用interface来定义
 * 2、java中接口和类是并列的结构
 * 3、如何定义接口：定义接口的成员
 *      3.1、jdk7以及以前
 *          只能定义全局常量和抽象方法
 *          》全局常量：public static final（书写时可以省略）
 *          》抽象方法：public abstract
 *      3.2、jdk8以及以后
 *          除了全局常量和抽象方法之外，还能定义静态方法、默认方法
 *          》（见compare）
 * 4、接口中不可以定义构造器，意味着接口不可以实例化
 *
 * 5、java开发中，接口都通过类去实现（implement）的方式来使用
 *          如果实现类覆盖了接口中的全部抽象方法，则此实现类可以实例化
 *          否则，此类必须声明成abstract
 *
 * 6、java类可以实现多个接口，弥补了单继承的局限性
 *      格式：权限修饰符 class AA extends 父类 implements 接口1，接口2{}
 *
 * 7、接口与接口之间可以多继承
 *
 * 8、接口的使用可以体现多态性
 *
 * 9、接口实际上可以看作是一种规范
 *
 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MIN_SPEED);
    }
}

interface Flyable{
    //全局常量
    public static final double MAX_SPEED = 7900;//第一宇宙速度
    double MIN_SPEED = 1;//省略了public static final

    //抽象方法
    public abstract void Fly();

    void Stop();//public abstract 同样可以省略
}

interface Attackable{
    public abstract void attack();

}

class Plane implements Flyable{
    @Override
    public void Fly() {
        System.out.println("飞机飞");
    }

    @Override
    public void Stop() {
        System.out.println("飞机停");
    }
}

class Bullet extends Object implements Flyable,Attackable,Interface3{

    @Override
    public void Fly() {
        System.out.println("子弹飞");
    }

    @Override
    public void Stop() {
        System.out.println("子弹停");
    }

    @Override
    public void attack() {
        System.out.println("子弹打人");
    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}

//接口的多继承
interface Interface1{
    public abstract void method1();
}

interface Interface2{
    public abstract void method2();
}

interface Interface3 extends Interface1,Interface2{}

abstract class Test implements Interface1,Interface2{
    public void info(){
        System.out.println("抽象类可以实现接口，且不一定要实现接口中的方法");
    }
}

class Test1 implements Interface1,Interface2{
    @Override
    public void method1() {
        System.out.println("非抽象类实现接口时，需要实现接口中的方法");
    }

    @Override
    public void method2() {

    }
}