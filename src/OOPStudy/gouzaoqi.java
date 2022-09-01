package OOPStudy;

/*
* 类的结构之三：构造器（构造方法、constructor）的使用
* 一、构造器的作用
*   1、创建对象
*   2、初始化对象的信息（可以通过改变形参列表的方式定义多个构造器）
*
* 二、说明
*   1、如果没有显示的定义类的构造器，系统会提供默认的空参的构造器
*   2、定义构造器的格式：权限修饰符 类名（形参列表）{}
*
*
* 关于this调用构造器
* 1、在类的构造器中，可以显式地用“this(形参列表)”的方式，调用本类中指定的其他构造器
* 2、不能通过“this(形参列表)”的方式调用自己
* 3、由2.可知，在有n个构造器的类中，最多只能有n-1个构造器通过这种方式调用其他构造器
* 4、规定：“this(形参列表)”只能声明在当前构造器的首行
* 5、由4、可知一个构造器内部只能用这种方式调用一次其他构造器
*
* 注：this可以调用属性、方法、构造器
*
* */
public class gouzaoqi {
    public static void main(String[] args){
        person person = new person("tom", 18);
        int age = person.getAge();
        String name = person.getName();
        System.out.println("姓名"+name+"年龄"+age);
    }
}

class person{
    //属性
    private String name;
    private int age;

    //构造器
    public person(){
        age = 18;
    }

    public person(String m, int n){
        age = n;
        name = m;
    }
    //方法
    public void eat(){}
    public void setAge(int i){
        age = i;
    }

    public int getAge(){
        return age;
    }

    public void setName(String m){
        name = m;
    }

    public String getName(){
        return name;
    }
}