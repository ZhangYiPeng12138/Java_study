package exercis;

public class ArrayUtilsTest {
    public static void main(String[] args){
        int[] arr = new int[]{41,12,44,55,32,78,55,13,65,-12,1,-99};
        ArrayUtils arrayUtils = new ArrayUtils();
//        int max = arrayUtils.getMax(arr);
//        int min = arrayUtils.getMin(arr);
//        int sum = arrayUtils.getSum(arr);
//        double average = arrayUtils.getAverage(arr);
//        arrayUtils.reverse(arr);
//        arrayUtils.traverse(arr);
        arrayUtils.bubbleSort(arr);
//        arrayUtils.traverse(arr);
//        System.out.println("最大值：" + max + "最小值：" + min + "总和：" + sum + "平均值：" + average);
//        arrayUtils.find(arr, 100);
        arrayUtils.traverse(arr);
    }
}
