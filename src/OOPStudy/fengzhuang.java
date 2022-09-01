package OOPStudy;
/*
* 当我们创建一个对象之后，可以通过“对象.属性”的方式对属性进行赋值，这里的赋值
* 只收到属性的数据类型和存储范围限制，但在实际情况中，需要给属性赋值加入额外的
* 限制条件，这样的限制条件需要在方法中进行添加
* 同时，我们需要避免“对象.属性”的方式对属性赋值，因此需要讲属性设置为private
* --》》此时就体现出了对属性的封装性
*
* 封装性的体现：
* 1、将属性私有化（private），通过公有的（public）方法设置和获取属性
* 2、不对外暴露的私有方法
* 3、单例模式
*
* 封装性的体现需要权限修饰符配合
* 1、四种权限修饰符(从小到大)：private、缺省(default)、protected、public
*   修饰符/权限范围：    类内     同一个包    不同包的子类      同一个工程
*   private             √
*   缺省                 √         √
*   protected           √         √         √
*   public              √         √         √               √
*
* 2、可以用来修饰类和类的内部结构：属性、方法、构造器、内部类
*
* 3、具体的，四种权限都可以用来修饰类的内部结构：属性、方法、构造器、内部块
*           修饰类class时只能public和缺省
*
* 总结封装性：Java提供了四种权限修饰符，体现了类和内部结构在被调用时可见性的大小
* */
public class fengzhuang {
    public static void main(String[] args){
        animals ani = new animals();
        ani.setLegs(4);
        System.out.println(ani.getLegs());
    }
}

class animals{
    String name;
    private int legs;
    int age;

//    对属性的设置
    public void setLegs(int i){
        if (i >= 0 && (i % 2) == 0)
            legs = i;
        else
            legs = 0;
    }

//    对属性的获取
    public int getLegs(){
        return legs;
    }
}