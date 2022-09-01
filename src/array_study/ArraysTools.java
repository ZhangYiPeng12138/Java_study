package array_study;
import java.util.Arrays;
public class ArraysTools {
    public static void main(String[] args){
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{9,8,3,4,5};
        if (Arrays.equals(arr1,arr2))
            System.out.println("相等");
        Arrays.fill(arr1, 5);
        Arrays.sort(arr2);
        int pos = Arrays.binarySearch(arr2,10);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println("位置"+pos);
    }
}
