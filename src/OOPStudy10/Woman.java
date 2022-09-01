package OOPStudy10;

public class Woman extends Person{
    boolean isBeauty;

    @Override
    public void eat() {
        System.out.println("为了减肥吃的很少");
    }

    @Override
    public void walk() {
        System.out.println("运动较少");
    }
}