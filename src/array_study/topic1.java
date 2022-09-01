package array_study;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class topic1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int i = 0;
        int result = 0;
        for (int j = 0; j < n; j++) {
            arr[j] = scanner.nextInt();
        }
        if (n < 3)
            System.out.println(result);
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int j = 0; j < n; j++) {
            if (j % 2 == 0){
                if (map.containsKey(arr[j])){
                    map.put(arr[j], map.get(arr[j])+1);
                }else
                map.put(arr[j], 1);
            }else {
                if (map1.containsKey(arr[j])){
                    map1.put(arr[j], map1.get(arr[j])+1);
                }else
                    map1.put(arr[j], 1);
            }
        }

        int val = 0;//最多的次数
        int val1 = 0;
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        Iterator<Map.Entry<Integer, Integer>> iterator1 = map1.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<Integer, Integer> next = iterator.next();
            int value = next.getValue();
            if(value > val){
                val = value;
            }
        }

        while(iterator1.hasNext()){
            Map.Entry<Integer, Integer> next1 = iterator1.next();
            int value1 = next1.getValue();
            if(value1 > val1){
                val1 = value1;
            }
        }
        System.out.println(n-val-val1);
    }
}