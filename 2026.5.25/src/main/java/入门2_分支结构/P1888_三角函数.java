package 入门2_分支结构;

import java.util.Scanner;

public class P1888_三角函数 {

    public static int[] sort(int a, int b, int c) {
        if(a > b){
            if(c > a){
                return new int[]{b,a,c};
            }else {
                if(c > b){
                    return new int[]{b,c,a};
                }else {
                    return new int[]{c,b,a};
                }
            }
        }else {
            if(b > c){
                if(c > a){
                    return new int[]{a,c,b};
                }else {
                    return new int[]{c,a,b};
                }
            }else {
                return new int[]{a,b,c};
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] arr = sort(a,b,c);

        System.out.println(arr[0] + "/" + arr[2]);

    }
}
