package collection;

import java.util.*;

/**
 * @BelongsProject: Java_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-08-22  21:12
 * @Description: TODO
 * @Version: 1.0
 */
public class RandomAccessTest {
    private List<String> list = null;

    public RandomAccessTest(List<String> list) {
        this.list = list;
    }

    public void loop(){
        if (list instanceof RandomAccess){
            System.out.println("for循环");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }else {
            System.out.println("iterator迭代器");
            Iterator<String> iterable = list.iterator();
            while (iterable.hasNext()){
                System.out.println(iterable.next());
            }
        }
    }

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list2.add("1");
        list2.add("2");
        list2.add("3");
        new RandomAccessTest(list1).loop();
        new RandomAccessTest(list2).loop();
    }
}