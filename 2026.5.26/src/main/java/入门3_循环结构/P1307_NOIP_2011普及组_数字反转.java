package 入门3_循环结构;

import java.util.Scanner;

public class P1307_NOIP_2011普及组_数字反转 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N >= 0){
            String str = String.valueOf(N);
            String resStr = new StringBuilder(str).reverse().toString();
            Integer res = Integer.valueOf(resStr);
            System.out.println(res);
        }else {
            int n = Math.abs(N);
            while(n % 10 == 0){
                n /= 10;
            }
            String str = String.valueOf(n);
            String resStr = new StringBuilder(str).reverse().toString();
            Integer res = Integer.valueOf(resStr);
            System.out.println("-" + res);
        }
    }
}
