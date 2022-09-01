package OOPStudy_Interface.Compare;

/**
 * jdk8以及以后
 *          除了全局常量和抽象方法之外，还能定义静态方法、默认方法
 *
 * 1、接口中定义的静态方法，只能通过接口调用
 * 2、通过实现类的对象，可以调用接口中的默认方法
 * 3、实现类可以对默认方法进行重写
 * 4、如果实现类（子类）继承的父类和实现的接口中声明了 同名同参数的方法
 *      那么子类在没有重写的情况下，调用的是父类的方法（类优先原则）
 * 5、如果实现类实现了多个接口，而接口中定义了同名同参的默认方法，如果
 *      实现类没有进行重写，则会报错（接口冲突）
 * 6、如何在子类中调用父类和接口中的方法
 *    调用父类方法：super.方法名（）;
 *    调用接口中的方法：接口名.super.方法名（）;
 */
public interface compareA {

    //静态方法
    public static void method1(){
        System.out.println("CompareA静态");
    }

    //默认方法
    public default void method2(){
        System.out.println("CompareA默认");
    }
}
