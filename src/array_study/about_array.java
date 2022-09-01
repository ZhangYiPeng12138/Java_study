package array_study;
import java.util.Arrays;
/*
*数组是同类型数据按照一定顺序排列的组合，并使用一个名字命名
*通过编号的方式统一管理
*
* 数组的相关概念
* 》数组名
* 》元素
* 》下标
* 》长度
*
* 数组的特点：
* 1、数组是有序排列的
* 2、数组属于引用数据类型的变量，数组的元素既可以是基本数据类型也可以是引用数据类型
* 3、创建数组对象会在内存空间中开辟一段连续空间，数组名引用的就是开辟空间的首地址
* 4、数组长度一旦确定便不可以修改
*
* 数组的分类：
*   按照维度：
*       一维数组:
            静态定义：int[] dim1_array = new int[]{1,2,3,4};
            动态定义：String[] dim1_array = new String[5];
*       二维数组
*           可以将二维数组理解为一个一维数组作为另一个一维数组的元素而存在
*           从数组的底层运行机制来看，其实不存在二维或者多维数组
    *           静态定义：int[][] dim2_array = new int[][]{{1,2,3},{1,2},{4,5}}
                动态定义：String[][] dim2_array = new String[5][3]
                        String[][] dim2_array = new String[5][]
*       多维数组
*   按照元素类型：基本数据类型元素的数组、引用数据类型元素的数组
* */
public class about_array {

    public static boolean dim1_isRepeat(int[] arr_dim1){
        boolean isRepeat = false;
        for (int i = 0;i < arr_dim1.length;i++)
            for (int j = i+1;j < arr_dim1.length;j++)
                if (arr_dim1[i] == arr_dim1[j])
                    isRepeat = true;
        return isRepeat;
    }

    //判断数天学号是否重复
    public static boolean dim2_isRepeat(int[][] arr_dim2, int cnt){
        boolean isRepeat = false;
        label:for (int i = 0;i < cnt;i++){
                for (int k = i;k < cnt;k++){
                    for (int j = 0;j < arr_dim2[k].length;j++){
                        if (Arrays.binarySearch(arr_dim2[i], arr_dim2[k+1][j])>0) {
                            isRepeat = true;
                            break label;
                        }

                    }
                }
            }
        return isRepeat;
    }

    public static void main(String[] args){
        boolean isRepeat = false;
        boolean[] arr = new boolean[]{true, false, true};
        System.out.println(arr);
        char[] arr1 = new char[]{'a','b','c'};
        System.out.println(arr1);
    }
}
