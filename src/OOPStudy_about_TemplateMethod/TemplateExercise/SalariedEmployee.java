package OOPStudy_about_TemplateMethod.TemplateExercise;

/**
 * @BelongsProject: Java_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-07-15  17:11
 * @Description: TODO
 * @Version: 1.0
 */
public class SalariedEmployee extends Employee{
    private double monthlySalary;//月工资

    public SalariedEmployee(String name,  Mydate birthday, double monthlySalary) {
        super(name, birthday);
        this.monthlySalary = monthlySalary;
    }


    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee["+super.toString()+"]";
    }
}