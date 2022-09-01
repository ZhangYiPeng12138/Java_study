package Puke;

import java.util.Random;

/**
 * @BelongsProject: Java_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-07-10  21:29
 * @Description: TODO
 * @Version: 1.0
 */
public class PuKe {
    String hua;
    String num;

    public PuKe(){}

    public PuKe(String hua, String num) {
        this.hua = hua;
        this.num = num;
    }

    @Override
    public String toString() {
        return "["+hua+num+"]";
    }

    public static void main(String[] args) {
        String h[] = {"黑桃","花子","红桃","花片"};
        String n[] = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        PuKe p[] = new PuKe[52];
        int c = 0;
        for (int k=0;k<13;k++){
            for (int j=0;j<4;j++){
                p[c] = new PuKe(h[j], n[k]);
//                p[c].num = n[k];
//                System.out.println(p[c]+"\n");
                c++;
            }
        }

        //输出赋值后的扑克
        for (int k=0;k<p.length;k++){
            System.out.print(p[k]+" ");
            if ((k+1)%12==0)
                System.out.println();
        }

        //利用随机交换进行洗牌
        for (int k=0;k<p.length;k++){
            Random random = new Random();
//            System.out.println("["+random);
            int a = random.nextInt(52);//0~51
            if (!p[k].equals(p[a])){
                PuKe temp = p[k];
                p[k] = p[a];
                p[a] = temp;
            }
        }

        //输出洗牌后的扑克
        System.out.println();
        System.out.println("---------------------------------------------");
        for (int k=0;k<p.length;k++){
            System.out.print(p[k]+" ");
            if ((k+1)%12==0)
                System.out.println();
        }
    }
}