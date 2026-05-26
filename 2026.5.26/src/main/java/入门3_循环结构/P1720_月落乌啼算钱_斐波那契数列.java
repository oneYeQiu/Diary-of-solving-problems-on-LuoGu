package 入门3_循环结构;

import java.util.Scanner;

public class P1720_月落乌啼算钱_斐波那契数列 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double res = (Math.pow(((1+Math.sqrt(5))/2),n) - Math.pow(((1-Math.sqrt(5))/2),n)) / Math.sqrt(5);
        System.out.printf("%.2f",res);
    }
}
