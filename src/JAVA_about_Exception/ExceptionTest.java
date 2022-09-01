package JAVA_about_Exception;

/**
 * 异常的体系结构
 *
 * 顶级的父类
 * java.lang.Throwable
 *      其有两个子类：
 *          1、java.lang.Error：一般不编写代码进行处理
 *          2、java.lang.Exception：可以进行异常的处理
 *              2.1、编译时异常（checked）
 *                  2.1.1、IOException
 *                      2.1.1.1、FileNotFoundException
 *                  2.1.2、ClassNotFoundException
 *              2.2、运行时异常（unchecked）
 *                  2.2.1、NullPointerException（空指针）
 *                  2.2.2、ArrayIndexOutOfBoundsException（数组角标越界）
 *                  2.2.3、ClassCastException
 *                  2.2.4、NumberFormatException
 *                  2.2.5、InputMissMatchException
 */
public class ExceptionTest {
}