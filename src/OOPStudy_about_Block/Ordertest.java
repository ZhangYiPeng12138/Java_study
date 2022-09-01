package OOPStudy_about_Block;

/**
 * 对属性可以赋值的位置
 *      1、默认初始化
 *      2、显示初始化
 *      3、构造器初始化
 *      4、创建对象后可以通过“对象.属性”、“对象.方法”赋值
 *      5、代码块中赋值
 *
 * 其先后顺序为：1 - 2 or 5 - 3 - 4
 */
public class Ordertest {
    public static void main(String[] args) {
        order o = new order();
        System.out.println(o.id);
    }
}
class order{
    {
        id = 5;
    }
    int id = 3;
}