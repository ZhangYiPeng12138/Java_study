package AboutThread;

/**
 * 创建三个窗口卖票，总票数为100张.
 * 使用实现Runnable接口的方式实现
 * 存在线程安全问题，待解决。
 *
 *
 * 比较创建线程的两种方式：
 *      开发中优先选择实现Runnable的方式
 *          原因：1、实现接口的方式没有类的单继承性限制
 *                2、实现接口的方式更适合于多个线程共享数据的情况
 *      两种方式之间的联系：Thread类本身是实现了Runnable接口的
 *   共同点：都需要重写run()方法，将线程要执行的逻辑放在run()中
 *
 *
 *
 *
 */

class Windows1 implements Runnable{
    private  int NUM = 100;
    @Override
    public void run() {
        while (NUM > 0){
            System.out.println("当前窗口为：" + Thread.currentThread().getName() + ";当前剩余票数为:" + NUM);
            NUM--;
        }
    }
}

public class WindowsTest1 {
    public static void main(String[] args) {
        Windows1 w = new Windows1();
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