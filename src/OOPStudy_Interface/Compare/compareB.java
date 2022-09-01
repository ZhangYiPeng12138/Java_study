package OOPStudy_Interface.Compare;

/**
 * @BelongsProject: Java_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-07-23  21:16
 * @Description: TODO
 * @Version: 1.0
 */
public interface compareB {
    public default void method2(){
        System.out.println("多个接口重名");
    }
}
