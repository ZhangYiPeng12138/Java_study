package OOPStudy_about_TemplateMethod.TemplateExercise;

/**
 * @BelongsProject: Java_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-07-15  17:06
 * @Description: TODO
 * @Version: 1.0
 */
abstract public class Employee {
    private String name;
    private int number;
    private Mydate birthday;
    private static int init = 1001;

    public Employee(){
        number = init++;
    }

    public Employee(String name, Mydate birthday) {
        this();
        this.name = name;
        this.birthday = birthday;
    }

    public abstract double earnings();

    @Override
    public String toString() {
        return "姓名："+name+",工号："+number+",生日："+birthday.toDateString();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBirthday(Mydate birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public Mydate getBirthday() {
        return birthday;
    }
}

