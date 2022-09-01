package OOPStudy5;

/**
 * @BelongsProject: Java_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-05-19  14:19
 * @Description: 继承性的学习
 *
 * 面向对象的特征之二：继承性
 * 一、继承性的好处
 *  1、减少了代码的冗余
 *  2、便于功能的扩展
 *  3、为之后的多态性的使用提供了前提
 *
 * 二、继承性的格式：class A extends B{}
 *  A：子类、派生类、subclass
 *  B：父类、超类、基类、superclass
 *  1、一旦子类A继承了父类B之后，A就拥有了B声明所有的属性、方法、
 *      特别的：父类中声明的private的属性或方法，同样会被继承，但是因为封装性的问题，不能直接调用
 *  2、子类继承父类后，还可以定义自己特有属性和方法：实现功能的拓展
 *      子类和父类的关系，不同于子集和集合的关系
 *
 * 三、java种关于继承的规定
 *  1、一个类可以被多个子类继承
 *  2、Jav中类的单继承：一个类只能有一个父类，不支持多重继承
 *  3、子父类是相对的概念
 *  4、子类直接继承的父类叫直接父类，间接继承的父类叫间接父类
 *  5、子类继承了直接父类和间接父类的所有属性和方法
 *
 * 四、
 *  1、如果没有显式地声明一个类地父类的话，则此类继承于java.lang.Object类
 *  2、所有的Java类都直接或间接地继承了java.lang.Object类
 *  3、意味着所有的Java类都有Object类的功能
 *
 * @Version: 1.0
 */
public class person {
    int age;
    String name;
    char sex;

    person(){}

    person(String name, char sex, int age){
        this.age = age;
        this.name = name;
        this.sex = sex;
    }
}