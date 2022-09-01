package exercis;
import java.util.Scanner;
public class huixingshu {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个数字");
        int len = scanner.nextInt();
        int[][] arr = new int[len][len];

        int s = len * len;
        /*
         * k = 1:向右 k = 2:向下 k = 3:向左 k = 4:向上
         */
        int k = 1;
        int i = 0, j = 0;
        for (int m = 1; m <= s; m++) {
            if (k == 1) {
                if (j < len && arr[i][j] == 0) {
                    arr[i][j++] = m;
                } else {
                    k = 2;
                    i++;
                    j--;
                    m--;
                }
            } else if (k == 2) {
                if (i < len && arr[i][j] == 0) {
                    arr[i++][j] = m;
                } else {
                    k = 3;
                    i--;
                    j--;
                    m--;
                }
            } else if (k == 3) {
                if (j >= 0 && arr[i][j] == 0) {
                    arr[i][j--] = m;
                } else {
                    k = 4;
                    i--;
                    j++;
                    m--;
                }
            } else if (k == 4) {
                if (i >= 0 && arr[i][j] == 0) {
                    arr[i--][j] = m;
                } else {
                    k = 1;
                    i++;
                    j++;
                    m--;
                }
            }
        }

        // 遍历
        for (int m = 0; m < arr.length; m++) {
            for (int n = 0; n < arr[m].length; n++) {
                System.out.print(arr[m][n] + "\t");
            }
            System.out.println();
        }

//        方式二
//        int n = 7;
//        int[][] arr = new int[n][n];
//
//        int count = 0; // 要显示的数据
//        int maxX = n - 1; // x轴的最大下标
//        int maxY = n - 1; // Y轴的最大下标
//        int minX = 0; // x轴的最小下标
//        int minY = 0; // Y轴的最小下标
//        while (minX <= maxX) {
//            for (int x = minX; x <= maxX; x++) {
//                arr[minY][x] = ++count;
//            }
//            minY++;
//            for (int y = minY; y <= maxY; y++) {
//                arr[y][maxX] = ++count;
//            }
//            maxX--;
//            for (int x = maxX; x >= minX; x--) {
//                arr[maxY][x] = ++count;
//            }
//            maxY--;
//            for (int y = maxY; y >= minY; y--) {
//                arr[y][minX] = ++count;
//            }
//            minX++;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                String space = (arr[i][j] + "").length() == 1 ? "0" : "";
//                System.out.print(space + arr[i][j] + " ");
//            }
//            System.out.println();
//        }

    }
}
