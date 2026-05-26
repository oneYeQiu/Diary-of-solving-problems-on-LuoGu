package 入门3_循环结构;

import java.util.Scanner;

public class P1035_NOIP2002普及组_级数求和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = 1;
        double Sn = 1;
        while(Sn <= k){
            n++;
            Sn += 1.0/n;
        }
        System.out.println(n);
    }
}
