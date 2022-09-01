package OOPStudy_about_main;

/**
 * main()方法的使用说明
 * 1、main()方法作为程序的入口
 * 2、main()是一个普通的静态方法
 * 3、main()方法也可以作为与控制台的交互方式（其他的方式还有Scanner）
 *
 *
 *
 */
public class Maintest {
    public static void main(String[] args) {
//        Main.main(new String[50]);
        for (int i = 0;i < args.length;i++){
            System.out.println("******"+args[i]);
            int num = Integer.parseInt(args[i]);
            System.out.println("######"+num);
        }
    }
}

class Main{
    public static void main(String[] args) {
        for (int i = 0;i < args.length;i++){
            args[i] = "args" + (i+1);
            System.out.println(args[i]);
        }
    }
}