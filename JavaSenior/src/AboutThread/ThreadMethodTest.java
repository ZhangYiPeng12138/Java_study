package AboutThread;

/**
 * @BelongsProject: Java_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-08-09  15:00
 * @Description: 测试Thread类中的常用方法
 *              1、start():启动线程，调用线程的run方法
 *              2、run():需要被重写，将线程需要进行的操作放在run方法体中
 *              3、currentThread():静态方法，返回当前代码执行的线程
 *              4、getName():获取当前线程的名字
 *              5、setName():设置当前线程的名字
 *              6、yield()：释放当前CPU的执行权
 *              7、join():在线程A中调用线程B的join()方法，此时线程A进入阻塞状态，直到
 *                  线程B完全执行之后，A的阻塞状态才会结束
 *              8、stop():强制结束当前线程，但是不推荐使用
 *              9、sleep(long millitime):让当前线程睡眠指定的millitime毫秒，在指定的
 *                  时间内当前线程是阻塞状态
 *              10、isAlive():
 *
 *
 * 线程的优先级：
 * 1、
 *    MAX_PRIORITY:10
 *    NORM_PRIORITY:5 -->默认优先级
 *    MIN_PRIORITY:1
 * 2、如何获取和设置当前线程的优先级
 *      getPriority();//获取
 *      setPriority(int p);//设置
 *
 * 优先级的高低是通过执行概率体现的，并不绝对
 * @Version: 1.0
 */

class ThreadMethod extends Thread{

    //还可以通过构造器进行线程的命名
    ThreadMethod(){

    }

    ThreadMethod(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ":" + i + " " + Thread.currentThread().getPriority());
            }
            if (i % 10 == 0){
                yield();
            }
        }
    }
}
public class ThreadMethodTest {
    public static void main(String[] args) {
        ThreadMethod t1 = new ThreadMethod();
        //给分线程命名
        t1.setName("线程一");
        //设置分线程的优先级
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();

        //通过构造器对分线程进行命名
        ThreadMethod t2 = new ThreadMethod("线程二");
        //设置分线程的优先级
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();

        //给主线程命名
        //使用Thread.currentThread获取当前线程
        Thread.currentThread().setName("主线程");

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i + " " + Thread.currentThread().getPriority());
            }
            if (i == 10){
                try {
                    t1.join();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            if (i == 20){
                try {
                    t2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
        System.out.println(Thread.currentThread().isAlive());
    }
}