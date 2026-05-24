package 入门1_顺序结构;

import java.util.Scanner;

public class B2029_大象喝水 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int r = sc.nextInt();
        double one = 3.14*r*r*h;
        int  result = (int)Math.ceil(20000/one);
        System.out.println(result);
    }
}
