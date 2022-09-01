package OOPStudy6;

/**
 * @BelongsProject: Java_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-06-25  20:22
 * @Description: TODO
 * @Version: 1.0
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        c1.setRadius(5);
        c1.setLength(4);
        System.out.println("c1的体积是：" + c1.findVolume());
        System.out.println("c1的面积是：" + c1.findarea());
    }
}