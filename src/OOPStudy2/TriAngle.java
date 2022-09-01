package OOPStudy2;

public class TriAngle {
    private double base;
    private double height;

    public TriAngle(){}

    public TriAngle(double a, double b){
        base = a;
        height = b;
    }

    public void setBase(double base1){
        base = base1;
    };

    public double getBase() {
        return base;
    }

    public void setHeight(double height1){
        height = height1;
    }

    public double getHeight() {
        return height;
    }

    public double computeArea(){
        return 0.5*getBase()*getHeight();
    }
}
