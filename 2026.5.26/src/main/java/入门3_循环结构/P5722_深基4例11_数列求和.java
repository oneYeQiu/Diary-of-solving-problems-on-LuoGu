package 入门3_循环结构;

import java.util.Scanner;

public class P5722_深基4例11_数列求和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
        }
        System.out.println(res);
    }
}
