package exercis;
import java.util.Scanner;

public class dim1_array {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生个数：");
        int num = scanner.nextInt();
        int[] arr = new int[num];
        int max = 0;
        System.out.println("请依次输入学生成绩：");
        for(int i = 0;i < arr.length;i++){
            arr[i] = scanner.nextInt();
            while (max < arr[i])
                max = arr[i];
        }
        System.out.println("最高成绩为："+max);
        for(int j = 0;j < arr.length;j++){
            int differ = max-arr[j];
            if (differ <= 10)
                System.out.println("学生"+(j+1)+"成绩为"+arr[j]+"成绩等级为A");
            else if (differ <= 20)
                System.out.println("学生"+(j+1)+"成绩为"+arr[j]+"成绩等级为B");
            else if (differ <= 30)
                System.out.println("学生"+(j+1)+"成绩为"+arr[j]+"成绩等级为C");
            else
                System.out.println("学生"+(j+1)+"成绩为"+arr[j]+"成绩等级为D");
        }
    }
}
