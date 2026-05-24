package 入门1_顺序结构;

import java.util.Scanner;

public class P1421_小玉买文具 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = (a*10+b) / 19;
        System.out.println(result);
    }
}
