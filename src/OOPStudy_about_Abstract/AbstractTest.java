package OOPStudy_about_Abstract;

import OOPStudy10.AnimalTest;

/**
 * abstract （抽象的）关键字的使用
 * abstract可以用来修饰类、方法、
 * 1、abstract修饰类：抽象类
 *      1、1被修饰的类不可以被实例化
 *      1、2抽象类中依然有构造器，便于子类对象实例化时调用
 *      1、3开发中都会提供抽象类的子类，让子类实例化对象，完成相关的操作
 *
 *
 * 2、abstract修饰方法：抽象方法
 *      2、1 抽象方法只有方法的声明，没有方法体
 *      2、2 包含抽象方法的类一定是抽象类；反之抽象类中可以没有抽象方法
 *      2、3 若子类重写了父类中的所有抽象方法后，此子类才可以实例化
 *           若子类没有重写父类中的所有抽象方法，则此子类也需要声明成抽象类
 *
 */
public class AbstractTest {
    public static void main(String[] args) {
//        PersonTest p1 = new PersonTest(26, "张三");

    }
}

abstract class Animals{
    public abstract void breathe();
}

abstract class Person extends Animals{
    int age;
    String name;

    public Person(){}

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

//    public void eat(){
//        System.out.println("人吃饭");
//    }
    //抽象方法
    public abstract void eat();

    @Override
    public void breathe() {
        System.out.println("呼吸");
    }

    public void walk(){
        System.out.println("人走路");
    }
}

class Student extends Person{
    int StudentID;

    public Student(){
        super();
    }

    public Student(int age, String name, int studentID){
        super(age, name);
        this.StudentID = studentID;
    }

    @Override
    public void breathe() {
        super.breathe();
        System.out.println("学生一样呼吸");
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("学生多喝牛奶");
    }
}

abstract class Test extends Student{
    public void TestInfo(){
        System.out.println("抽象类可以继承非抽象类");
    }
}