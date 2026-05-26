package 入门3_循环结构;

import java.util.Scanner;

public class P1423_小玉在游泳 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s = sc.nextDouble();
        double sum = 2;
        double tem = 2*0.98;
        int res = 1;
        while (true){
            if(sum >= s){
                break;
            }
            sum += tem;
            res++;
            tem *= 0.98;
        }
        System.out.println(res);
    }
}
