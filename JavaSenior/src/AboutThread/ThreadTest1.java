package AboutThread;

/**
 * 多线程创建：方式二  实现Runnable接口
 * 1、创建一个实现了Runnable接口的类
 * 2、实现Runnable中的run方法
 * 3、创建实现类的对象
 * 4、将此对象传递到Thread的构造器中，创建Thread类的对象
 * 5、通过Thread类的对象调用start方法
 *
 */

class MyThread1 implements Runnable{
    MyThread1(){}
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

public class ThreadTest1 {
    public static void main(String[] args) {
        MyThread1 m1 = new MyThread1();
        new Thread(m1).start();
    }
}