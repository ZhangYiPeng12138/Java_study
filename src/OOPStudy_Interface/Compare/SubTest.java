package OOPStudy_Interface.Compare;

/**
 *
 */
public class SubTest {
    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.method2();
        compareA.method1();
        compareA c = new compareA() {
            @Override
            public void method2() {
                System.out.println("匿名");
            }
        };
        c.method2();
        sub.mymethod();
    }
}

class Sub extends Super implements compareA,compareB {
    @Override
    public void method2() {
        System.out.println("重写");
    }

    public void mymethod(){
        method2();
        super.method2();
        compareA.super.method2();
        compareB.super.method2();
    }
}