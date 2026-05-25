package 入门2_分支结构;

import java.util.Scanner;

public class P5709_深基2习6_ApplesPrologue_or_苹果和虫子 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int t = sc.nextInt();
        int s = sc.nextInt();
        if(t == 0){
            System.out.println(0);
        }else{
            int result = m - (int)Math.ceil(s/(t*1.0));
            System.out.println(Math.max(result, 0));
        }
    }
}

