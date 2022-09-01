package OOPStudy_Interface.Interface_exercise;

import OOPStudy_OverWrite.Person;

/**
 * @BelongsProject: Java_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-07-20  21:33
 * @Description: TODO
 * @Version: 1.0
 */
public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(2.5);
        ComparableCircle c2 = new ComparableCircle(2.4);
        Person p = new Person();
        System.out.println(c1.compareTo(c2));
//        c1.compareTo(p);
    }
}