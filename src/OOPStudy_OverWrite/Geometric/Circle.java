package OOPStudy_OverWrite.Geometric;

/**
 * @BelongsProject: Java_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-07-02  20:34
 * @Description: TODO
 * @Version: 1.0
 */
public class Circle extends GemetricObject {
    private double radius;//半径

    public Circle(){
        super();
        this.radius = 1.0;
    }

    public Circle(double radius){
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, double weight){
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //计算圆的面积
    public double findArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Circle){
            Circle circle = (Circle)obj;
            return this.radius == circle.radius;
        }
        return false;
    }

    @Override
    public String toString() {
        return "半径为：" + this.radius;
    }
}