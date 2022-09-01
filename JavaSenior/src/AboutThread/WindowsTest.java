package AboutThread;

/**
 * 创建三个窗口卖票，总票数为100张.
 * 使用继承Thread类方法实现
 * 存在线程安全问题，待解决。
 */

class Windows extends Thread{
    private static int NUM = 100;

    Windows(){}

    Windows(String name){
        super(name);
    }

    @Override
    public void run() {
        while (NUM > 0){
            System.out.println("当前窗口为：" + this.getName() + "当前剩余票数" + NUM);
            NUM-- ;
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