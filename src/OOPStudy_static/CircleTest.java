package OOPStudy_static;

/**
 * static关键字的应用
 *
 *
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle();
        System.out.println("c1 id is " + c1.getId());
        System.out.println("c2 id is " + c2.getId());
        System.out.println("c3 id is " + c3.getId());
        System.out.println("the num of Circle is " + Circle.getTotal());
        Circle c4 = new Circle(3.14);
        System.out.println("c4 id is " + c4.getId());
        System.out.println("the num of Circle is " + Circle.getTotal());
    }
}

class Circle{
    private double radius;
    private int id;
    private static int total;//记录创建圆的个数
    private static int init = 1001;//static声明的属性被对象所共享

    public static int getTotal() {
        return total;
    }

    public Circle(){
        id = init++;//这里的构造器每调用一次id都会被加1，表明id不因对象而改变
        total++;

    }

    public Circle(double radius){
        this();
//        id = init++;
//        total++;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public int getId() {
        return id;
    }
}