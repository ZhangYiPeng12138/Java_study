package OOPStudy8;

/**
 * 关于Super关键字
 * 1、可以理解为：父类的(类似于this的理解)
 * 2、Super可以调用父类的属性、方法、构造器
 *
 * 3、super的使用：调用属性和方法
 *      1、可以在子类的方法和构造器中，通过“super.属性”、“super.方法”的方式显示地
 *          调用父类中的属性或者方法。通常情况下会省略
 *      2、当子类和父类声明了同名的属性，想要在子类中调用父类的同名属性，就必须使用
 *          “super.属性”的方式，表明调用的是父类的属性
 *      3、当子类重写了父类的方法后，依然想使用父类中的方法时，就必须用“super.方法”
 *          的方式，表明调用的是父类被重写的方法
 *
 * 4、super调用构造器
 *      1、可以在子类的构造器中通过“super(形参列表)”的方式调用父类中的构造器
 *      2、“super(形参列表)”的使用，必须声明在构造器的首行
 *      3、由于2的性质与“this(形参列表)”的方式相冲突，所以二者只能同时存在一个
 *      4、在构造器的首行没有显示地声明”super(形参列表)“或者”this(形参列表)“，则默认调用的
 *          是父类中空参的构造器，即”super()“
 *      5、在类的多个构造器中，至少有一个类的构造器使用了”super(形参列表)“
 *
 *
 */
public class SuperTest {
    public static void main(String[] args) {
        student s1 = new student();
        s1.show();
        s1.eat();
        student s2 = new student("tom", 26, "NJTech", 1002);
        s2.show();
        student s3 = new student();
    }

}