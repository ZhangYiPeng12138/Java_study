package OOPStudy7;

/**
 * 体会四种不同的权限修饰符
 *
 * 修饰符      类内部   同一个包  不同包子类   同一个项目
 * private      √
 * 缺省          √        √
 * protected    √        √         √
 * public       √        √         √       √
 *
 *
 */
public class Order {
    private int orderPrivate;
    int orderDefault;
    protected int orderProtected;
    public int orderPublic;

    private void methodPrivate(){}
    void methodDefault(){}
    protected void methodProtected(){}
    public void methodPublic(){}
}