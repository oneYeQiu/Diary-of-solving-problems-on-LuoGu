package 入门3_循环结构;

import java.util.Scanner;

public class P5719_深基4例3_分类平均 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int tem = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= n; i++) {
            if(i % k == 0){
                tem++;
                sum1 += i;
            }else{
                sum2 += i;
            }
        }
        double res1 = sum1/(tem*1.0);
        double res2 = sum2/((n-tem)*1.0);
        System.out.printf("%.1f", res1);
        System.out.print(" ");
        System.out.printf("%.1f", res2);
    }
}
