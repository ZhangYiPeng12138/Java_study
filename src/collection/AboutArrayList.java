package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @BelongsProject: Java_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-08-22  21:30
 * @Description: TODO
 * @Version: 1.0
 */
public class AboutArrayList {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<Object>();
        int[][] array = new int[][]{{1,2},{3,4},{5,6}};
        String[] array1 = new String[]{"a", "b", "c", "d"};
        list = Arrays.asList(array);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getClass());
        }

        List<String> list1 = new ArrayList<String>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        Object[] s = list1.toArray();
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}