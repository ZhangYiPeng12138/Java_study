package exercis;
import java.util.Calendar;

public class lottery {
    public static void main(String[] args){
        long time_start = Calendar.getInstance().getTimeInMillis();
        int[] arr = new int[100];
//  方式一
        for (int i = 0;i < arr.length;i++){
            arr[i] = (int)(Math.random()*300 + 1);
            boolean flag = false;
            while (true){
                for (int j = 0;j < i;j++){
                    if (arr[i] == arr[j]){
                        flag = true;
                        break;
                    }
                }
                if (flag){
                    arr[i] = (int)(Math.random()*30 + 1);
                    flag = false;
                    continue;
                }
                break;
            }
        }
        long time_end1 = Calendar.getInstance().getTimeInMillis();
//        方式二
        int[] arr1 = new int[100];
        for (int i = 0;i < arr1.length;i++){
            arr1[i] = (int)(Math.random()*300 + 1);
            for (int j = 0;j < i;j++){
                if (arr1[i] == arr1[j]){
                    i--;
                    break;
                }
            }
        }
        long time_end2 = Calendar.getInstance().getTimeInMillis();
        System.out.println(time_end1-time_start);
        System.out.println(time_end2-time_end1);
//        for (int i = 0;i < arr.length;i++)
//            System.out.println(arr1[i]);
    }
}
