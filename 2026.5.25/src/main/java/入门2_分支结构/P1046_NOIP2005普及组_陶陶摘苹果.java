package 入门2_分支结构;

import java.util.Scanner;

public class P1046_NOIP2005普及组_陶陶摘苹果 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        int high = sc.nextInt();
        int high2 = high + 30;
        int result = 0;
        for (int i = 0; i < 10; i++) {
            if(high2 >= arr[i]){
                result += 1;
            }
        }
        System.out.println(result);
    }
}
