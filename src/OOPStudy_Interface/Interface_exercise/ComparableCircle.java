package OOPStudy_Interface.Interface_exercise;

/**
 * @BelongsProject: Java_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-07-20  21:17
 * @Description: TODO
 * @Version: 1.0
 */
public class ComparableCircle extends Circle implements CompareObject {
    public ComparableCircle(double radius){
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o)
            return 0;
        if (o instanceof ComparableCircle){
            ComparableCircle circle = (ComparableCircle)o;
            if (this.getRadius() == circle.getRadius()){
                return 0;
            }else if (this.getRadius() > circle.getRadius()){
                return 1;
            }else
                return -1;
        }else {
            throw new RuntimeException("传入数据类型不匹配");
        }
    }
}