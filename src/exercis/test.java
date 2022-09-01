package exercis;

/**
 * @BelongsProject: Java_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-06-09  09:07
 * @Description: TODO
 * @Version: 1.0
 */
public class test {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = s1;
        String s5 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s5));
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));

        System.out.println("No1: " + (s1 == s5));
        System.out.println("No2: " + (s1.equals(s5)));
        System.out.println("No3: " + (s1 == s2));
        System.out.println("No4: " + s1 == s2);
        System.out.println("No5: " + s1.equals(s2));
        System.out.println("No6: " + (s3 == s4));
        System.out.println("No7: " + s3.equals(s4));
    }
}