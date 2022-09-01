package OOPStudy2;

public class BoyGirlTest {
    public static void main(String[] args){
        Boy boy = new Boy("张一鹏", 26);
        Girl girl = new Girl("朱碧玉", 24);
        boy.marry(girl);
        boy.shout();
        girl.marry(boy);
        System.out.println(girl.compare(new Girl("某某", 27)));
    }
}
