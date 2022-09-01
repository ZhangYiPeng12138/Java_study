package AboutThread.ThreadSafeProblem;

/**
 * 创建三个窗口卖票，总票数为100张.
 * 使用继承Thread类方法实现
 * 存在线程安全问题，待解决。
 *
 * 使用同步代码块的方式解决继承Thread类的线程安全问题
 *
 * 在继承Tread类的方式中慎用this方式充当同步监视器，可以考虑使用当前类充当同步监视器
 */

class Windows extends Thread{
    private static int NUM = 100;
    static Object obj = new Object();
    Windows(){}

    Windows(String name){
        super(name);
    }

    @Override
    public void run() {
        synchronized (Windows.class){
            while (NUM > 0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("当前窗口为：" + this.getName() + "当前剩余票数" + NUM);
                NUM-- ;
            }
        }
    }
}

public class WindowsTest {
    public static void main(String[] args) {
        Windows w1 = new Windows("窗口一");
        Windows w2 = new Windows("窗口二");
        Windows w3 = new Windows("窗口三");
        w1.start();
        w2.start();
        w3.start();
    }
}