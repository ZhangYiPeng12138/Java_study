package OOPStudy_OverWrite.Geometric;

public class GemetricObject {
    protected String color;//颜色
    protected double weight;

    public GemetricObject() {
        super();
        this.color = "white";
        this.weight = 1.0;
    }

    protected GemetricObject(String color, double weight){
        super();
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


}