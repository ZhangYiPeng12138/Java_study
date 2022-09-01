package OOPexercise;

import java.util.Scanner;
import java.util.Vector;

/*
 *  利用Vector代替数组处理：从键盘读入学生成绩（以负数代表输入结束），找出最高分，并输出学生成绩等级。
	提示：数组一旦创建，长度就固定不变，所以在创建数组前就需要知道它的长度。
	而向量类java.util.Vector可以根据需要动态伸缩。

	创建Vector对象：Vector v=new Vector();
	给向量添加元素：v.addElement(Object obj);   //obj必须是对象
	取出向量中的元素：Object  obj=v.elementAt(0);
	注意第一个元素的下标是0，返回值是Object类型的。
	计算向量的长度：v.size();
	若与最高分相差10分内：A等；20分内：B等；
	      30分内：C等；其它：D等
 *
 */
public class ScoreTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector v = new Vector();

        int max = 0;
        for (;;){
            System.out.println("请输入成绩，以复数结尾");
            int score = scanner.nextInt();
            if (score < 0) break;
            if (score > 100) {
                System.out.println("成绩无效，请重新输入");
                continue;
            }
            v.addElement(score);//自动装箱
            if (max < score) max = score;
        }

        System.out.println("最高分为"+max);

        char level;
        for (int i = 0;i < v.size();i++){
            Object obj = v.elementAt(i);
            //jdk5.0之前
//            Integer inscore = (Integer)obj;
//            int score = inscore.intValue();
            //jdk5.0之后
//            int score = (Integer) obj;
//            或者直接(Integer)obj
            if ((max - (Integer)obj)<10){
                level = 'A';
            }else if ((max - (Integer)obj)<20){
                level = 'B';
            }else if ((max - (Integer)obj)<30){
                level = 'C';
            }else level = 'D';

            System.out.println("Student-" + (i+1) + " score is" + (Integer)obj + " level is" + level);
        }
    }
}