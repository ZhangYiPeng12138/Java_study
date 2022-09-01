package OOPStudy_about_TemplateMethod;

/**
 * 抽象类的应用：模板方法的设计模式
 */
public class TemplateTest {
    public static void main(String[] args) {
        Template t1 = new SubTemplate();
        t1.spendtime();
    }
}

abstract class Template{

    //计算某段代码需要花费的时间
    public void spendtime(){
        Long start = System.currentTimeMillis();
        method();
        Long end = System.currentTimeMillis();
        System.out.println("花费时间为"+(end-start));
    }

    public abstract void method();
}

class SubTemplate extends Template{
    @Override
    //计算质数
    public void method() {

        for (int i = 2;i < 1000;i++){
            boolean flag = true;
            for (int j = 2;j < Math.sqrt(i);j++){
                if ((i % j)==0){
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println(i+"为质数");
        }
    }
}