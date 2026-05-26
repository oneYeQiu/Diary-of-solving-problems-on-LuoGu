package 入门3_循环结构;

import java.util.Scanner;

public class P5725_深基4习8_求三角形 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tem1 = 1;
        int tem2 = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (tem1 < 10) {
                    System.out.print("0" + tem1);
                } else {
                    System.out.print(tem1);
                }
                tem1++;
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                if (tem2 < 10) {
                    System.out.print("0" + tem2);
                } else {
                    System.out.print(tem2);
                }
                tem2++;
            }
            System.out.println();
        }

    }
}
