package OOPStudy_static;


public class ArrayUtilStatic {
    //    求数组最大值
    public static int getMax(int[] arr){
        int MaxValue = 0;
        for (int i = 0;i < arr.length;i++){
            if (arr[i] > MaxValue)
                MaxValue = arr[i];
        }
        return MaxValue;
    }

    //    求数值最小值
    public static int getMin(int[] arr){
        int MinValue = 0;
        for (int i = 0;i < arr.length;i++){
            if (arr[i] < MinValue)
                MinValue = arr[i];
        }
        return MinValue;
    }

    //    求数组总和
    public static int getSum(int[] arr){
        int SumValue = 0;
        for (int i = 0;i < arr.length;i++){
            SumValue += arr[i];
        }
        return SumValue;
    }

    //    求数组平均值
    public static double getAverage(int[] arr){
        return getSum(arr) / arr.length;
    }

    //    反转数组
    public static void reverse(int[] arr){
        int temp;
        for (int i = 0;i < arr.length / 2;i++){
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    //    复制数组
    public static int[] copy(int[] arr){
        int[] arr1 =new int[arr.length];
        for (int i = 0;i < arr.length;i++)
            arr1[i] = arr[i];
        return arr1;
    }

    //    数组冒泡排序
    public static void bubbleSort(int[] arr){
        int temp;
        for (int i = 0;i < arr.length;i++)
            for (int j = 0;j < arr.length -1 - i;j++){
                if (arr[j] > arr[j + 1]){
//                    temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
                    swap(arr, j, j+1);
                }
            }
    }

    //    交换
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //    遍历数组
    public static void traverse(int[] arr){
        String str = "[";
        for (int i = 0;i < arr.length;i++){
            if (i != arr.length-1)
                str = str + arr[i] + ",";
            else
                str = str + arr[i] + "]";
        }
        System.out.println(str);
    }

    //    查找元素
    public static void find(int[] arr, int element){
        boolean flag = true;
        for (int i = 0;i < arr.length;i++){
            if (arr[i] == element){
                System.out.println("元素位置" + (i + 1));
                flag = false;
                break;
            }
        }
        if (flag == true)
            System.out.println("未找到该元素");
    }
}