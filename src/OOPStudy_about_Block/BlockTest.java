package OOPStudy_about_Block;

/**
 * 类的成员：代码块（或初始化块）
 * 1、代码块的作用：用来初始化类、对象
 * 2、代码块如果有修饰的话，只能有static
 * 3、静态代码块与非静态代码块
 * 4、静态代码块
 *      1、内部可以有输出语句
 *      2、随着类的加载而执行，且只执行一次
 *      作用：初始化类的一些信息
 *      3、如果在类中定义了多个静态代码块，则按照定义的先后顺序执行
 *      4、静态代码块的执行要优先于非静态代码块
 *      5、静态代码块内只能调用静态的属性或者方法
 *
 * 5、非静态代码块
 *      1、内部可以有输出语句
 *      2、随着对象的创建而执行
 *      3、每创建一个对象就执行一次非静态代码块
 *      作用：可以在创建对象时初始化对象的属性或其他
 *      4、如果在类中定义了多个非静态代码块，则按照定义的先后顺序执行
 *      5、非静态代码块内既可以调用静态的也可以调用非静态的属性和方法
 *
 *
 */
public class BlockTest {
    public static void main(String[] args) {
        String desc = Person.desc;
        System.out.println(Person.desc);
        Person p1 = new Person();
        Person p2 = new Person();
    }
}

class Person{
    //属性
    String name;
    int age;
    static String desc = "I am a person";

    //构造器
    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //代码块
    static{
        System.out.println("Hello!Static Block-1");
        desc = "I am a person and i love studying";
    }

    static{
        System.out.println("Hello!Static Block-2");
        desc = "I am a person and i love studying-2";
    }

    {
        System.out.println("Hello! Block-1");
    }

    {
        System.out.println("Hello! Block-2");
    }


    //方法
    public void eat(){
        System.out.println("吃饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}