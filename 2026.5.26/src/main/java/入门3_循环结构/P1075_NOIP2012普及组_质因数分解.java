package 入门3_循环结构;

import java.util.Scanner;

public class P1075_NOIP2012普及组_质因数分解 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tem = 2;
        while(!(n % tem == 0)){
            tem++;
        }
        System.out.println(n/tem);
    }
}
