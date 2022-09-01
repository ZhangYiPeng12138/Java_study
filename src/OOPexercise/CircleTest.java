package OOPexercise;

public class CircleTest {
    public static void main(String[] main){
        Circle circle = new Circle();
        circle.r = 5;
        System.out.println(circle.computeArea());


        CircleTest circleTest = new CircleTest();
        System.out.println(circleTest.mehod(2,5));
    }

    public int mehod(int m,int n){
        for (int i = 0;i < m;i++){
            for (int j = 0;j < n;j++)
                System.out.print("* ");
            System.out.println();
        }
        return m*n;
    }
}

class Circle{
//    属性
    double r;
//    方法
    public double computeArea(){
        return Math.PI*r*r;
    }
}