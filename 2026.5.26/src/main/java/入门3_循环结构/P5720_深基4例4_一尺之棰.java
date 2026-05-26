package 入门3_循环结构;

import java.util.Scanner;

public class P5720_深基4例4_一尺之棰 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        while(n > 1){
            n /= 2;
            res++;
        }
        System.out.println(res);
    }
}
