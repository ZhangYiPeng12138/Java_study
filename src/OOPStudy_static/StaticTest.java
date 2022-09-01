package OOPStudy_static;

/**
 * static关键字的使用
 *
 * 1、static：静态的
 * 2、static可以用来修饰属性、方法、代码块、内部类
 * 3、使用static修饰属性:静态变量（类变量）
 *      3.1、属性按照是否使用static分为静态属性 vs 非静态属性（实例属性）
 *          实例变量：我们创建了多个对象，每个对象都有一套独立的非静态属性，当修改某个对象中的非静态属性时，
 *                  不会导致其他对象的非静态属性的修改。
 *          静态变量：我们创建了多个对象，多个对象共享同一个静态变量，当某一个对象修改静态变量时，会导致其他
 *                  对象调用此静态变量时，是修改过的。
 *      3.2、static修饰属性的其他说明
 *          1、静态变量随着类的加载而加载,可以通过“类.静态变量”的方法进行调用
 *          2、静态变量的加载要早于对象的创建
 *          3、由于类只会加载一次，则静态变量在内存中也只有一份，存在与方法区的静态域中
 *          4、      类变量     实例变量
 *             类      yes        no
 *            对象      yes       yes
 *      3.3、静态属性的举例：可以直接通过类调用
 *          System.out;Math.PI
 *
 * 4、使用static修饰方法：静态方法
 *      4.1、随着类的加载而加载，可以通过“类.方法”的方式去调用
 *      4.2、          静态方法（类方法）     非静态方法（实例方法）
 *             类       yes                  no
 *            对象      yes                  yes
 *      4.3、静态的方法中只能调用静态的方法或者属性
 *
 *           非静态方法中既可以调用静态的方法或属性也可以调用非静态的方法或者属性
 * 5、static的注意点
 *     5.1、不能在静态方法中使用this关键字、super关键字
 *     5.1、关于静态属性和静态方法，可以从生命周期理解
 *
 * 6、开发中如何确实一个属性是否需要声明为static
 *      该属性可以被多个对象所共享的，不会随着对象的不同而不同
 *      类中的常量一般声明为static
 *
 *   开发中如何确实一个方法是否需要声明为static
 *      操作静态属性的方法通常设置为静态的
 *      工具类中的方法，习惯上声明为static，比如Math、Arrays、Collections
 */
public class StaticTest {
    public static void main(String[] args) {
        Chinese.nation = "中国";
        Chinese c1 = new Chinese();
        c1.name = "张三";
        c1.age = 26;
        c1.nation = "CN";

        Chinese c2 = new Chinese();
        c2.name = "李四";
        c2.age = 27;
        System.out.println(c2.nation);
        Chinese.show();
        c1.eat();
    }
}

class Chinese{
    String name;
    int age;
    static String nation;

    public void eat(){
        System.out.println("吃饭");
    }

    public static void show(){
        System.out.println("我是中国人");
    }
}