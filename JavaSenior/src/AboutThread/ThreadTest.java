package AboutThread;

/**
 * 多线程的创建，方式一：
 * 1、创建一个继承于Thread类的子类
 * 2、重写Thread类的run方法
 * 3、创建Thread子类的对象
 * 4、通过对象调用start方法--->>启动当前线程，调用线程中的run()方法
 *
 *
 * 例子：遍历一百以内的所有偶数
 */

//创建一个继承于Thread类的子类
class MyThread extends Thread{
    //重写Thread类的run方法
    //将要做的事情写在run方法内
    @Override
    public void run() {
        for (int i = 0;i < 100;i++){
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}


public class ThreadTest {
    public static void main(String[] args) {
        //创建Thread子类的对象
        MyThread m = new MyThread();
        MyThread m1 = new MyThread();
        //通过对象调用start方法
        m.start();
        //不能通过直接调用run方法的方式启动线程
        //m.run();

        //启动第二个线程。不可以让已经start的线程继续执行，否则会报错IllegalThreadStateException
        //m.start();
        //需要重新创建一个线程的对象
        m1.start();

        //如下的内容仍然在main线程中执行的
        for (int i = 0;i < 100;i++){
            if (i % 2 != 0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}