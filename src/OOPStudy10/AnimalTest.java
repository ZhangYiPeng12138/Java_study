package OOPStudy10;

import javax.sql.ConnectionEvent;

/**
 * 多态性的举例
 *
 *
 */

//举例一
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.func(new dog());
        test.func(new cat());
    }

    public void func(Animal animal){
        animal.eat();
        animal.shout();
    }
}

class Animal{
    public void eat(){
        System.out.println("吃东西");
    }
    public void shout(){
        System.out.println("发出声音");
    }
}

class dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void shout() {
        System.out.println("汪汪汪");
    }
}

class cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void shout() {
        System.out.println("喵喵喵");
    }
}
//举例二
class Order{
    public void method(Object object){}
}

//举例三
class Driver{
    public void doData(ConnectionEvent coon){
        //coon = new MySQLConnection()
        //规范的步骤操作数据
    }

}