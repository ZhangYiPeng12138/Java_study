package array_study;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int arr[] = new int[]{51,4,28,7,0,-2,45,3};
        int temp;
        for (int i = 0;i < arr.length -1 ;i++){
            for (int j = 0;j < arr.length - 1 - i;j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
