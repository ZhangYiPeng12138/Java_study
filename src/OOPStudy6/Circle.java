package OOPStudy6;

/**
 * @BelongsProject: Java_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-06-25  20:12
 * @Description: 定义一个圆的属性以及计算圆面积的方法
 * @Version: 1.0
 */
public class Circle {
    private double radius;//半径
    Circle(){
        this.radius = 1.0;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double findarea(){
        return 3.14*this.radius*this.radius;
    }
}