package OOPStudy_Interface.Interface_exercise;

/**
 * @BelongsProject: Java_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-07-20  21:14
 * @Description: TODO
 * @Version: 1.0
 */
public interface CompareObject {
    //若返回值为0，代表相等；若为正数，代表当前对象大；若为负数，代表当前对象小
    public int compareTo(Object o);
}
