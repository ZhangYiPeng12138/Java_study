package AboutThread.exercise;

/**
 * @BelongsProject: Java_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-08-09  14:45
 * @Description: 创建两个分线程，其中一个线程遍历一百以内的偶数，一个遍历一百以内的奇数
 * @Version: 1.0
 */

class Mythread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0;i < 100;i++){
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}

class Mythread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        //方式一：规范通过继承类、创建对象的四步骤
        Mythread1 m1 = new Mythread1();
        Mythread2 m2 = new Mythread2();
        m1.start();
        m2.start();

        //方式二：创建Thread类的匿名子类的方式
        new Thread(){
            @Override
            public void run() {
                for (int i = 0;i < 100;i++){
                    if (i % 2 == 0){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 0;i < 100;i++){
                    if (i % 2 != 0){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();
    }
}