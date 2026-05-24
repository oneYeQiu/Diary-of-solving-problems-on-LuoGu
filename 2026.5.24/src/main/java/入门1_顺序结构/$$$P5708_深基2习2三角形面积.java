package 入门1_顺序结构;

import java.util.Scanner;

public class $$$P5708_深基2习2三角形面积 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double p = (a+b+c) / 2;
        double result = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.printf("%.1f",result);
    }
}
