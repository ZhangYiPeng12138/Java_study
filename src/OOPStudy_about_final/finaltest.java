package OOPStudy_about_final;

/**
 * final关键字
 * 1、final可以修饰的结构：类、方法、变量
 * 2、final修饰类：此类不能被其他类继承
 *                  比如String类、System类、StringBuffer类
 * 3、final修饰方法：此方法不可以被重写
 *                  比如Object类中的getClass（）方法；
 * 4、final修饰变量：此时的变量成为一个常量（习惯将final修饰的都大写）
 *      final修饰属性：可以考虑赋值的位置有：1、显示初始化
 *                                      2、代码块中初始化
 *                                      3、构造器中初始化
 *      final修饰局部变量：尤其是final修饰形参时，表明此形参是一个常量
 *                      当我们调用此方法时，给常量赋予一个实参。一旦赋值
 *                      之后，只能在方法体内调用此形参，但不能重新赋值
 *
 * static final可以修饰属性：称为全局常量
 *
 *
 *
 */
public class finaltest {
}