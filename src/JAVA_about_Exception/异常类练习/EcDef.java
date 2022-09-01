package JAVA_about_Exception.异常类练习;

/**
 * @BelongsProject: Java_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-07-26  21:51
 * @Description: TODO
 * @Version: 1.0
 */
public class EcDef extends Exception{
    static final long serialVersionUID = -334551699312428L;

    public EcDef(){};

    public EcDef(String msg){
        super(msg);
    };
}