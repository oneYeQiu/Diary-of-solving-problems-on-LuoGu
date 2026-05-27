package 入门4_数组;
// todo 不会
import java.util.Scanner;

public class P5728_深基5例5_旗鼓相当的对手 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(Math.abs(arr[i][0] - arr[j][0]) <= 5 && Math.abs(arr[i][1] - arr[j][1]) <= 5 && Math.abs(arr[i][2] - arr[j][2]) <= 5){
                    int sum1 = arr[i][0] + arr[i][1] + arr[i][2];
                    int sum2 = arr[j][0] + arr[j][1] + arr[j][2];
                    if(Math.abs(sum1 - sum2) <= 10){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
