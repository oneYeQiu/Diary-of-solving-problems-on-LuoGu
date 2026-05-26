package 入门3_循环结构;

import java.util.Scanner;

public class P5721_深基4例6_数字直角三角形 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tem = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n-i; j++) {
                if(tem < 10){
                    System.out.print("0" + tem);
                }else {
                    System.out.print(tem);
                }
                tem++;
            }
            System.out.println();
        }
    }
}
