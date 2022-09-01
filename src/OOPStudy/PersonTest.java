package OOPStudy;
/*
*一、设计类的成员
*   属性=成员变量=filed=域、字段
*   方法=成员方法=函数=method
*
*   创建类的对象=类的实例化=实例化类
*
* 二、类和对象的使用
*   1、创建类，对类的对象进行设计
*   2、实例化一个类的对象
*   3、通过（对象.属性、对象.方法）调用对象的结构
*
* 三、同一个类创建的多个对象有着各自独立的类的结构（非static）
*
* 四、对象的内存解析
* */
public class PersonTest {
    public static void main(String[] args){
//        创建person的对象
        peson peson1 = new peson();

//        调用对象的结构：属性、方法
//        peson1.age = 26;
        peson1.setAge(10);
        peson1.getAge();
        peson1.eat();
        peson1.sleep();
        peson1.talk("Chinese");
    }
}

class peson{
//    属性
    String name;
    private int age;
    boolean isMale;
//    方法
    public void setAge(int i){
        if (i < 0 || i > 130)
            throw new RuntimeException("年龄无效");
        else
            age = i;
    }

    public int getAge(){
        return age;
    }

    public void sleep() {
        System.out.println("人可以睡觉");
    }

    public void eat() {
        System.out.println("人可以吃东西");
    }

    public void talk(String language) {
        System.out.println("人可以说" + language);
    }
}
