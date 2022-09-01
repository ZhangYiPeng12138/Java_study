package Puke;

/**
 * @BelongsProject: Java_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-07-13  21:26
 * @Description: TODO
 * @Version: 1.0
 */
public class Single {
    public static void main(String[] args) {

    }
}

//饿汉式
class single{
    private single(){}
    private static single s1 = new single();
    public static single getS1(){
        return s1;
    }
}

//懒汉式
class single2{
    private single2(){}
    private static single2 s1 = null;
    public static single2 getS1(){
        if (s1 == null)
            s1 = new single2();
        return s1;
    }
}