package OOPexercise;

public class PassObeject {
    public static void main(String[] args){
        PassObeject passObeject = new PassObeject();
        Circle circle = new Circle();
        passObeject.printAreas(circle, 5);
        System.out.println("现在的半径为：" + (circle.r + 1));
    }

    public void printAreas(Circle circle,int time){
        System.out.println("半径\t\t面积");
        //设置圆的半径
        for (int i = 1;i <= time;i++){
            circle.r = i;
            System.out.println(circle.r + "\t\t" + circle.computeArea());
        }
    }
}
