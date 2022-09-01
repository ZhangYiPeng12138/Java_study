package exercis;
import java.util.Scanner;
import java.util.Arrays;

public class sampling {
    public static void sampling(int sum, double ratio, int days, int cnt){
//        一维数组arr存储总学号，二维数组per_day存储每天抽检学号
        int[] arr = new int[sum];
        int[][] per_day = new int[days][];

//        遍历数组，赋值学号
        for (int i = 1;i < sum+1;i++)
            arr[i-1] = i;

        per_day = random(per_day,arr,sum,ratio,days);


        dayin(per_day);
    }

//            打印名单
    public static void dayin(int[][] per_day){
        for (int i = 0;i < per_day.length;i++) {
            Arrays.sort(per_day[i]);
            System.out.println("第"+(i+1)+"天抽检学号为："+Arrays.toString(per_day[i]));
        }
    }

//    生成随机数赋值
    public static int[][] random(int[][] per_day,int[] arr,int sum, double ratio, int days){
        int[] isAppear = new int[sum];
        int temp;
        int count = 0;
        for (int i = 0;i < days;i++) {
            per_day[i] = new int[(int)(sum*ratio)];
            for (int j = 0; j < (int)(sum * ratio); j++){
                temp = (int)(Math.random()*sum-1);
                count++;
                if (isRise(isAppear, temp)){
                    j--;
                    count--;
                }
                else {
                    if (count>=sum-1)
                        count = sum -1;
                    isAppear[count] = temp;
                    per_day[i][j] = arr[temp];
                }

            }
//            if (dim1_isRepeat(per_day[i]))
//                i--;
        }
        return per_day;
    }

//判断每天学号是否有重复
    public static boolean dim1_isRepeat(int[] arr_dim1){
        boolean isRepeat = false;
        for (int i = 0;i < arr_dim1.length;i++)
            for (int j = i+1;j < arr_dim1.length;j++)
                if (arr_dim1[i] == arr_dim1[j])
                    isRepeat = true;
        return isRepeat;
    }


//判断随机数是否已经出现过
    public static boolean isRise(int[] arr, int random){
        boolean Repeat = false;
        for (int i = 0;i < arr.length;i++)
            if (arr[i] ==random)
                Repeat = true;
        return Repeat;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("此代码可保证单日抽取不重复，");
        System.out.println("请输入总人数：");
        int sum = scanner.nextInt();
        double ratio;
        do {
            System.out.println("请输入抽检比例：（0-1）之间");
            ratio = scanner.nextDouble();
        }while (ratio > 1&&ratio < 0);
        System.out.println("请输入天数：");
        int days = scanner.nextInt();
        System.out.println("请输入数字，代表几天内无重复学生：");
        int cnt = scanner.nextInt();
        System.out.println("共"+sum+"名学生，抽检比例为"+ratio*100+"%,抽检天数为："+days+"天。");
        sampling(sum,ratio,days,cnt);
    }
}
