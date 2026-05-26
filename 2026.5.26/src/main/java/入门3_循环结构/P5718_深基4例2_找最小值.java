package 入门3_循环结构;

import java.util.Scanner;

public class P5718_深基4例2_找最小值 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 0;
        for (int i = 0; i < n; i++) {
            if(i == 0) {
                min = sc.nextInt();
            }else {
                min = Math.min(sc.nextInt(), min);
            }
        }
        System.out.println(min);
    }
}
