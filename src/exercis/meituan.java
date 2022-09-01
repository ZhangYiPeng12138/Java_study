package exercis;

import java.util.Scanner;

/**
 *  小美开的西点屋举办一周年活动，她准备制作一批礼盒作为对消费者的回馈，
 *  每个礼盒中都有三枚西点屋的招牌点心。西点屋共有A和B两种招牌点心，为
 *  了让消费者都能品尝到两种点心，因此每个礼盒中都要包含至少一枚A点心和
 *  一枚B点心。现在小美的西点屋内共有x枚A点心和y枚B点心，请问小美最多可
 *  以制作多少个礼盒。
 *
 *  小美在做一个实验，这个实验会在纸带上打印出若干个数字，已知该实验所呈现出的正确结果应该是存在某一个分割处k，在k之前打印出的数字都是小于0的，而在k之后的数字应该都是大于0的，那么在k之前如果某一个数据大于等于0，那么我们认为这个数据是异常的，同理，在k之后如果某一个数据小于等于0，那么我们也认为这个数据是异常的。

    现在给出小美打印的纸带，且k是未知的，那么请问在最乐观的情况下至少有多少个实验数据是异常的。(显然如果出现0，无论k为哪个时刻，这个0数据都是异常的)
    5
    0 -1 1 1 -1

    2
 *
 */
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        long[][] array = new long[len][2];
        long[] result = new long[len];
        for (int i = 0;i < len;i++){
            for (int j = 0;j < 2;j++){
                array[i][j] = s.nextLong();
            }
        }

        for (int i = 0;i < len;i++){
            result[i] = Math.min(array[i][0], array[i][1]);
            long max = Math.max(array[i][0], array[i][1]);
            long min = Math.min(array[i][0], array[i][1]);
            if ((max % min) % 2 != 0){
                result[i]--;
            }
        }

        for (int i = 0;i < len;i++){
            System.out.println(result[i]);
        }
    }
}

class Main1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        int[] array = new int[len];

        for (int i = 0;i < len;i++){
            array[i] = s.nextInt();
        }

        int result = 0;
        int last_result = 0;
        for (int i = 0;i < len;i++){
            for (int j = 0;j <= i;j++){
                if (array[j] != -1)
                    result++;
            }
            for (int j = i + 1;j < len;j++){
                if (array[j] != 1)
                    result++;
            }
            if (i == 0)
                last_result = result;
            else last_result = Math.min(last_result, result);
            result = 0;
        }
        System.out.println(last_result);
    }
}

class Main2{
    public static void main(String[] args) {
        String muban = "MeiTuannauTieMwowwow";
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        int[] arr = new int[len];
        String result = " ";
        for (int i = 0;i < len;i++){
            arr[i] = s.nextInt();
        }

        for (int i = 0;i < len;i++){
            result = result + muban.charAt(arr[i] % 20 - 1);
        }

        for (int i = 1;i <result.length();i++){
            System.out.println(result.charAt(i));
        }
        /*
        * MeiTuannauTieMwowwow
        * MeiTuannauTieMwowwow
        * MeiTuannauTieMwowwow
        * MeiTuannauTieMwow
        * */
    }
}