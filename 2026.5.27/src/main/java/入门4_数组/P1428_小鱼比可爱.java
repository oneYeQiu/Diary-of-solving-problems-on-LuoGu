package 入门4_数组;

import java.util.Scanner;

public class P1428_小鱼比可爱 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if(arr[j] < arr[i]){
                    res++;
                }
            }
            System.out.print(res + " ");
            res = 0;
        }
    }
}
