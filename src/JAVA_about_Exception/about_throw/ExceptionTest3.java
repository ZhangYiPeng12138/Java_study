package JAVA_about_Exception.about_throw;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 异常处理方式二：throws + 异常类型
 *
 * 1、“throws+异常类型”写在方法的声明处，指明此方法执行时，可能会抛出的类型
 *    一但方法体出现异常时，仍会在代码异常处生成一个异常类的对象，此对象满足
 *    throws后的异常类型就会被抛出。
 *    异常代码处后续的便不再执行
 *
 * 2、try-catch-finally真正将异常进行了处理
 *    throws只是将异常抛给了方法的调用者，并没有真正处理
 * 3、开发中如何使用try-catch-finally还是throws
 *      3.1、如果父类中被重写的方法没有throws方式处理异常，则子类重写的方法
 *           就不能用throws，只能用try-catch-finally方式处理
 *      3.2、执行的方法中，先后调用了另外的几个方法，且方法之间是递进关系，这几个
 *          方法用throws处理，执行的方法使用try-catch-finally处理
 *
 */
public class ExceptionTest3 {

    public static void main(String[] args){
        try {
            method2();
        } catch (IOException e) {
            e.printStackTrace();
        }
        method3();
    }

    public static void method3(){
        try {
            method2();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void method2() throws IOException{
        metnod1();
    }

    public static void metnod1() throws FileNotFoundException, IOException{
        File file = new File("hello.txt");
        FileInputStream fileInputStream = new FileInputStream(file);

        int data = fileInputStream.read();
        while (data != -1){
            System.out.print((char) data);
            data = fileInputStream.read();
        }
        fileInputStream.close();
    }
}