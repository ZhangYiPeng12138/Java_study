package AboutThread.ThreadSafeProblem;

/**
 * 创建三个窗口卖票，总票数为100张.
 * 使用实现Runnable接口的方式实现
 * 存在线程安全问题，待解决。
 *      问题描述：卖票过程中出现了重票和错票-->出现了线程安全问题
 *      问题原因：当某个线程执行过程中还没结束时，另一个线程又开始执行了
 *      如何解决：当一个线程在执行过程中，其他线程不能参与进来，直到先前的线程执行完。
 *                即使先前的线程出现了阻塞也不例外
 *      java中通过同步机制，解决线程安全问题：
 *          方式一：同步代码块
 *              关键字：synchronized(同步监视器){
 *                  //需要被同步的代码-->操作共享数据的代码
 *              }
 *              说明：1、共享数据-->多个线程共同操作的数据
 *                   2、同步监视器-->俗称 “锁”，任何类的对象都可以充当锁
 *                      要求：多个线程必须共用同一把锁。
 *               在实现Runnable接口的方式中可以考虑用this充当同步监视器
 *
 *          方式二：同步方法-->如果操作共享数据的代码完整的声明在一个方法中，则可以将此方法声明为同步的
 *
 *      同步机制的好处-->解决了线程的安全问题
 *      同步机制的坏处-->操作同步代码时，只能有一个线程参与，效率会变低
 *
 *
 *
 *
 */

//同步代码块
class Windows1 implements Runnable{
    private  int NUM = 10;
    Object obj = new Object();
    @Override
    public void run() {
        synchronized(this){
            while (NUM > 0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("当前窗口为：" + Thread.currentThread().getName() + ";当前剩余票数为:" + NUM);
                NUM--;
            }
        }
    }
}


//同步方法
class Windows2 implements Runnable{
    private int NUM = 10;

    @Override
    public  void run() {
        while (true) {
            show();
        }
    }

    private synchronized void show(){
        if (NUM > 0) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("当前售票窗口为：" + Thread.currentThread().getName() + "，剩余票数：" + NUM);
            NUM--;
        }
    }
}

public class WindowsTest1 {
    public static void main(String[] args) {
//        Windows1 w = new Windows1();
        Windows2 w = new Windows2();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}