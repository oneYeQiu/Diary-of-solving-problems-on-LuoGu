package 入门1_顺序结构;

import java.util.Scanner;

public class P5705_深基2例7_数字反转 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String reverse = new StringBuilder(str).reverse().toString();
        System.out.println(reverse);
    }
}
