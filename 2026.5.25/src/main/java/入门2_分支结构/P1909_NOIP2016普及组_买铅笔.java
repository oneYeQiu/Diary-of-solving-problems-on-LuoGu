package 入门2_分支结构;

import java.util.Scanner;

public class P1909_NOIP2016普及组_买铅笔 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minPrice = 0;
        for (int i = 0; i < 3; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c =  (int)Math.ceil(n/(a*1.0));
            if(i == 0){
                minPrice = c*b;
            }
            minPrice = Math.min(c*b,minPrice);
        }
        System.out.println(minPrice);
    }
}
