package 入门2_分支结构;

import java.util.Scanner;

public class P5715_深基3例8三位数排序 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a > b){
            if(c > a){
                System.out.println(b + " " + a + " " + c);
            }else {
                if(c > b){
                    System.out.println(b + " " + c + " " + a);
                }else {
                    System.out.println(c + " " + b + " " + a);
                }
            }
        }else {
            if(b > c){
                if(c > a){
                    System.out.println(a + " " + c + " " + b);
                }else {
                    System.out.println(c + " " + a + " " + b);
                }
            }else {
                System.out.println(a + " " + b + " " + c);
            }
        }
    }
}
