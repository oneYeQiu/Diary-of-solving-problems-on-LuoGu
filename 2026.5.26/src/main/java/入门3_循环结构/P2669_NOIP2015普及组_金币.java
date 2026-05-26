package 入门3_循环结构;

import java.util.Scanner;

public class P2669_NOIP2015普及组_金币 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int day = 0;
        int res = 0;
        int tem = 1;
        while(true){
            if(day == k) break;
            for (int i = 0; i < tem; i++) {
                if(day == k) break;
                res += tem;
                day++;
            }
            tem++;
        }
        System.out.println(res);
    }
}
