package OOPStudy5;

/**
 * @BelongsProject: Java_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-06-25  15:18
 * @Description: TODO
 * @Version: 1.0
 */
public class KidsTest {
    public static void main(String[] args){
        Kids k1 = new Kids();
        k1.setSex(1);
        k1.setSalary(500);
        k1.manOrwoman();
        k1.employ();
        k1.setYearOld(18);
        int age = k1.getYearOld();
        System.out.println(age);
    }
}