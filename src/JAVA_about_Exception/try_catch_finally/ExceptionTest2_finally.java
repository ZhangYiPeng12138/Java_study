package JAVA_about_Exception.try_catch_finally;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * try-catch-finally中的finally的使用
 * try{
 *     //可能出现异常的代码
 * }catch(异常类型1 变量1){
 *     //异常的处理方式1
 * }catch(异常类型2 变量2){
 *     //异常的处理方式2
 * }
 * finally{
 *     //一定会执行的代码
 * }
 *
 * -----------------finally可选择是否使用
 * 1、finally中声明的是一定会被执行的代码，即使catch中也出现异常了，或try、catch出现了return语句
 * 2、像数据库连接、输入输出流、网络编程中的scoket等资源，JVM无法自动回收，所以需要手动进行资源的释放，
 *    此时资源的释放，就需要放在finally中。
 *
 */
public class ExceptionTest2_finally {
    public static void main(String[] args) {
        ExceptionTest2_finally.method1();
        try {
            ExceptionTest2_finally.method();
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        }catch (ArithmeticException e){
            e.printStackTrace();
            int[] a = new int[10];
            System.out.println(a[10]);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("一定会执行的代码");
        }
        System.out.println("不一定会执行的代码");


    }

    public static int method(){
        try {
            int[] a = new int[10];
            System.out.println(a[10]);
            return 1;
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            return 2;
        }finally {
            System.out.println("有返回值时也一定会被执行");
        }
    }

    public static void method1(){
        FileInputStream f1 = null;
        try {
            File f = new File("hello.txt");
            f1 = new FileInputStream(f);

            int data = f1.read();
            while (data != -1){
                System.out.print((char) data);
                data = f1.read();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (f1 != null)//f1的初始化是null，若没有成功创建，这里不做判断就会出现空指针异常
                    f1.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}