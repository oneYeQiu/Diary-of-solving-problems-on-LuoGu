package 入门3_循环结构;

import java.util.Scanner;

public class P5723_深基4例13_质数口袋 {
    public static boolean isPrime(int n){
        if(n < 2) return false;
        else {
            for (int i = 2; i*i <= n; i++) {
                if(n % i == 0) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int res = 0;
        int sum = 0;

        int tem = 1;
        while (true){
            if(sum >= L) break;
            if(isPrime(tem)){
                sum += tem;
                if(sum > L) break;
                res++;
                System.out.println(tem);
            }
            tem++;
        }
        System.out.println(res);
    }
}
