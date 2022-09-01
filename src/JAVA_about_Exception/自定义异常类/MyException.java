package JAVA_about_Exception.自定义异常类;

/**
 * 如何自定义异常类
 * 1、继承已有的异常结构：RuntimeException、Exception
 * 2、提供全局常量：serialVersionUID
 * 3、提供重载的构造器
 *
 */
public class MyException extends Exception{
    static final long serialVersionUID = -3345516993124229948L;
    public MyException(){}

    public MyException(String msg){
        super(msg);
    }
}