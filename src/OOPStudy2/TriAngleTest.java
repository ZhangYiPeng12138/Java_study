package OOPStudy2;

public class TriAngleTest {
    public static void main(String[] args){
//        TriAngle triAngle = new TriAngle(8, 5);
        TriAngle triAngle = new TriAngle();
        triAngle.setBase(8);
        triAngle.setHeight(5);
        System.out.println("三角形面积为:"+triAngle.computeArea());
    }
}
