package OOPStudy_Interface;

/**
 * 接口的使用
 * 1、接口的使用也满足多态性
 * 2、接口实际上就是定义了一种规范
 * 3、开发中，体会面向接口编程
 *
 */
public class USBtest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        //创建接口的非匿名实现的非匿名对象
        Flash flash = new Flash();
        Printer printer = new Printer();
        computer.transferDate(flash);
        computer.transferDate(printer);

        //创建接口的非匿名实现的匿名对象
        computer.transferDate(new Flash());
        computer.transferDate(new Printer());

        //创建接口的匿名实现的非匿名对象
        USB phone = new USB(){
            @Override
            public void start() {
                System.out.println("开始工作");
            }

            @Override
            public void stop() {
                System.out.println("停止工作");
            }
        };
        computer.transferDate(phone);

        //创建接口的匿名实现的匿名对象
        computer.transferDate(new USB() {
            @Override
            public void start() {
                System.out.println("111");
            }

            @Override
            public void stop() {
                System.out.println("222");
            }
        });
    }
}

class Computer{
    public void transferDate(USB usb){
        usb.start();
        System.out.println("具体的传输细节");
        usb.stop();
    }
}

interface USB{
    //定义了长、宽、传输速度等

    public abstract void start();

    public abstract void stop();
}

class Flash implements USB{

    @Override
    public void start() {
        System.out.println("U盘开始工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘停止工作");
    }
}

class Printer implements USB{
    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机停止工作");
    }
}