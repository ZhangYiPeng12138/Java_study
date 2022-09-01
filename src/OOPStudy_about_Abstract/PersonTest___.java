package OOPStudy_about_Abstract;

/**
 * 关于抽象类的匿名子类
 */
public class PersonTest___ {
    public static void main(String[] args) {

        //匿名对象
        PersonTest___.method(new Student());

        //非匿名对象、非匿名类
        //同时用到了多态
        Worker w1 = new Worker();
        PersonTest___.method1(w1);

        //匿名对象、非匿名类
        //同时用到了多态
        PersonTest___.method1(new Worker());

        //创建了一个匿名子类的对象p
        Person p = new Person() {
            @Override
            public void eat() {
                System.out.println("进行重写");
            }
        };

        PersonTest___.method1(p);

        //创建一个匿名子类的匿名对象
        PersonTest___.method1(new Person() {
            @Override
            public void eat() {
                System.out.println("进行第二次重写");
            }
        });
    }

    public static void method1(Person p){
        p.eat();
    }

    public static void method(Student student){}
}

class Worker extends Person{
    @Override
    public void eat() {
        System.out.println("工人吃饭");
    }
}