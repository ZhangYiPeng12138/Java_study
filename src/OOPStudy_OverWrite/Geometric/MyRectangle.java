package OOPStudy_OverWrite.Geometric;

/**
 * @BelongsProject: Java_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-07-02  20:37
 * @Description: TODO
 * @Version: 1.0
 */
public class MyRectangle extends GemetricObject {
    private double wdith;
    private double height;

    public MyRectangle(double wdith, double height, String color, double weight){
        super(color, weight);
        this.wdith = wdith;
        this.height = height;
    }

    public double getWdith() {
        return wdith;
    }

    public void setWdith(double wdith) {
        this.wdith = wdith;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double findArea() {
        return wdith * height;
    }
}