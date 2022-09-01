package OOPStudy10;

public class Man extends Person{
    boolean isSmoking;

    @Override
    public void eat() {
        System.out.println("食量较大");
    }

    @Override
    public void walk() {
        System.out.println("运动较多");
    }
}