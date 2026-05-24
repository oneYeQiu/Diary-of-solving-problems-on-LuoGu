package 入门1_顺序结构;

import java.util.Scanner;

public class P5706_深基2例8_再分肥宅水 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        int n = sc.nextInt();
        double re1 = num1 / n;
        System.out.printf("%.3f", re1);
        System.out.println();
        System.out.println(n*2);
    }
}
