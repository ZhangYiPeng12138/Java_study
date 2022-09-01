package OOPStudy5;

/**
 * @BelongsProject: Java_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-06-25  15:17
 * @Description: TODO
 * @Version: 1.0
 */
public class Kids extends ManKind {
    private int yearOld;
    Kids(){}

    public Kids(int sex, int salary, int yearOld) {
        super(sex, salary);
        this.yearOld = yearOld;
    }

    public int getYearOld() {
        return yearOld;
    }

    public void setYearOld(int yearOld) {
        this.yearOld = yearOld;
    }

    public void printAge(){
        System.out.println("yearOld=" + yearOld);
    }
}