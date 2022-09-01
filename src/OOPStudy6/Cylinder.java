package OOPStudy6;

/**
 * @BelongsProject: Java_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-06-25  20:20
 * @Description: 一个圆柱类，继承于圆类，定义了一个计算圆柱体积、表面积的方法
 * @Version: 1.0
 */
public class Cylinder extends Circle {
    private double length;//圆柱高
    Cylinder(){
        this.length = 1.0;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    /**
     * 计算圆柱体积
     * @return
     */
    public double findVolume(){
        return super.findarea()*this.length;
    }

    /**
     * 计算圆柱表面积，重写了父类中计算圆面积的方法
     * @return
     */
    public double findarea(){
        return 3.14*getRadius()*getRadius()*2 + 2*3.14*getRadius()*getLength();
    }
}