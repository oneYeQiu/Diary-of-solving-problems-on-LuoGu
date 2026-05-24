package 入门1_顺序结构;

import java.util.Scanner;

public class P1425_小鱼的游泳时间 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int result = h2*60 + m2 - h1*60 - m1;
        System.out.println(result/60 + " " + result%60);
    }
}
