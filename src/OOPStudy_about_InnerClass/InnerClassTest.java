package OOPStudy_about_InnerClass;

/**
 * 类的内部成员之五：内部类
 * 1、java中允许将一个类A声明在另一个类B中，则类A为内部类，类B为外部类
 * 2、内部类的分类：成员内部类（静态、非静态）  和  局部内部类（方法内、代码块内、构造器内）
 * 3、成员内部类：
 *      一方面，作为外部类的成员
 *          1、可以调用外部类的结构
 *             外部类.this.结构
 *          2、可以用static修饰
 *          3、可以被四种权限修饰符修饰
 *
 *      另一方面，作为一个类出现
 *          1、可以定义属性、方法、构造器等
 *          2、可以继承
 *          3、可以用final修饰，表示不可被继承
 *          4、可以用abstract修饰，表示不可以被实例化
 * 4、关注的问题
 *      4.1 如何实例化成员内部类的对象
 *      4.2 如何在成员内部类中区分调用外部类的结构
 *          内部类的属性：this.属性
 *          外部类的属性：外部类名.this.属性
 *      4.3 开发中局部内部类的使用
 */
public class InnerClassTest {
    public static void main(String[] args) {
        //创建一个Bird实例(静态成员内部类)
        Person.Bird bird = new Person.Bird();

        //创建一个Dog实例(非静态成员内部类)
        //必须先创建外部类的对象
        Person p = new Person();
        Person.Dog dog = p.new Dog();
        dog.display("。。");
    }
}

class Person{
    String name = "人名";
    int age;

    public void eat(){
        System.out.println("人吃饭");
    }
    //构造器
    public Person(){
        //局部内部类
        class AA{}
    }

    //方法
    public void method(){
        //局部内部类
        class BB{}
    }

    //代码块
    {
        //局部内部类
        class CC{}
    }

    //静态成员内部类
    static class Bird{
        String name;

        public Bird(){}

        public void sing(){
            System.out.println("唱歌");
        }
    }

    //非静态成员内部类
    class Dog{
        String name = "狗名";

        public Dog(){}

        public void sing(){
            System.out.println("唱歌");
            Person.this.eat();
        }

        public void display(String name){
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Person.this.name);
        }
    }

    //局部内部类的例子
    //返回一个实现了Comparable接口的类的对象
    public Comparable getComparable(){

        //创建一个实现了Comparable接口的类:局部内部类
        class MyComparable implements Comparable{

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }

        return new MyComparable();
    }
}