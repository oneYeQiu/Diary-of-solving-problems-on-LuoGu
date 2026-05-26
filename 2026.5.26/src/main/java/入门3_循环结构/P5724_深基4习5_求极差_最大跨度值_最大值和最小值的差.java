package 入门3_循环结构;

import java.util.Scanner;

public class P5724_深基4习5_求极差_最大跨度值_最大值和最小值的差 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int tem = sc.nextInt();
            if(i == 0){
                min = tem;
                max = tem;
            }
            max = Math.max(max, tem);
            min = Math.min(min, tem);
        }
        System.out.println(max - min);
    }
}
