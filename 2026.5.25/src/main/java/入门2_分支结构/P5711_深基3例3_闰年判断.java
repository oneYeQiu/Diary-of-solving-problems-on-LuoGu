package 入门2_分支结构;

import java.util.Scanner;

public class P5711_深基3例3_闰年判断 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 400 == 0){
            System.out.println(1);
        }else if (n % 100 != 0 && n % 4 == 0){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
