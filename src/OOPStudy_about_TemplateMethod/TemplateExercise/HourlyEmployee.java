package OOPStudy_about_TemplateMethod.TemplateExercise;

/**
 * @BelongsProject: Java_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-07-15  17:16
 * @Description: TODO
 * @Version: 1.0
 */
public class HourlyEmployee extends Employee {
    private double wage;//每小时工资
    private double hour;//工作时间

    public HourlyEmployee(String name, Mydate birthday, double wage, double hour) {
        super(name, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    @Override
    public double earnings() {
        return wage * hour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee["+super.toString()+"]";
    }
}