package OOPStudy_Singleton;

/**
 * 所谓的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对
 * 某个类只能创建一个对象实例
 *
 * 单例模式的实现：
 *      饿汉式 和 懒汉式
 *
 * 区分饿汉式和懒汉式：
 *      饿汉式：
 *          好处：是线程安全的
 *          坏处：对象加载时间过长
 *      懒汉式：
 *          好处：延迟对象创建
 *          目前的写法坏处：线程不安全-->涉及多线程时再改
 */
public class SingleTonTest {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
        Singleton2 s3 = Singleton2.getInstance();
        Singleton2 s4 = Singleton2.getInstance();
        System.out.println(s3 == s4);
        System.out.println("*********************");
        System.out.println(2.0-1.1);
        int a = 1;
        Integer b = new Integer(1);
        Integer c = new Integer(1);
        Integer d = Integer.valueOf(1);
        Long e = new Long(1);
        Long f = Long.valueOf(1);
        Long g = 1L;

        assert a == b;
        System.out.println(a == c);
        assert b != c;
        assert b != d;
        assert a == d;
        assert a == e;
        assert a == f;
        assert b.equals(c);
        assert !b.equals(e);
        System.out.println(b.equals(d));
        System.out.println(e == f);
        System.out.println(e.equals(f));
        System.out.println(a == g);
    }
}

//饿汉式
class Singleton{
    //1、私有化类的构造器
    private Singleton(){}
    //2、内部创建静态的类的对象
    private static Singleton instance = new Singleton();
    //3、提供公共的静态的方法返回类的对象
    public static Singleton getInstance(){
        return instance;
    }
}

//懒汉式
class Singleton2{
    //1、私有化类的构造器
    private Singleton2(){}
    //2、声明当前类的对象，没有初始化，且对象必须声明为static
    private static Singleton2 instance = null;
    //3、声明public、static的返回当前对象的方法
    public static Singleton2 getInstance(){
        if (instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}