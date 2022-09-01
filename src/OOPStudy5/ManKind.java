package OOPStudy5;

/**
 * @BelongsProject: Java_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-06-25  15:13
 * @Description: TODO
 * @Version: 1.0
 */
public class ManKind {
    private int sex;
    private int salary;
    ManKind(){}

    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void manOrwoman(){
        if (sex == 0){
            System.out.println("woman");
        }else {
            System.out.println("man");
        }
    }

    public void employ(){
        if (salary == 0){
            System.out.println("no job");
        }else {
            System.out.println("job");
        }
    }
}