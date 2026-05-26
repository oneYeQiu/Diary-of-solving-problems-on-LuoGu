package 入门3_循环结构;

import java.util.Scanner;

public class P1980_NOIP2013普及组_计数问题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int result = 0;
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            str.append(String.valueOf(i));
        }
        char[] chars = str.toString().toCharArray();
        for (char aChar : chars) {
            if (aChar - '0' == x) {
                result++;
            }
        }
        System.out.println(result);
    }
}
