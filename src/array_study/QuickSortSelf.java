package array_study;
import java.util.Arrays;
public class QuickSortSelf {
    public static int[] swap(int arr[],int i,int j){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }

    public static int[] quicksort(int data[], int start, int end){

        int base = data[start];
        int low = start;
        int high = end + 1;
        label:while (true){
            while (low < end && data[++low] <= base)
                ;
            while (high > start && data[--high] >= base)
                ;
            if (data[low] > data[high] && low < high)
                swap(data, low, high);
            if (low >= high){
                if (base < data[high]){
                    swap(data, start, high);
                    break label;
                }
                else
                    break label;
            }

        }
        quicksort(data,start,high-1);
        quicksort(data,high+1,end);

        return data;
    }


    public static void main(String[] args){
        int[] arr = new int[]{99, -16, 30, 23, -30, -49, 25, 21, 30};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

}
