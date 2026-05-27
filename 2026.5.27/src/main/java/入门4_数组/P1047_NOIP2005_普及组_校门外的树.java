package 入门4_数组;

// todo 不会 法1： 暴力，创建一个长度为l+1的布尔数组 先给元素全部赋值为true，然后再根据区域，再给特定区域内元素赋值为false；
//  法2：差分数组：


import java.util.Scanner;

public class P1047_NOIP2005_普及组_校门外的树 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int m = sc.nextInt();
        boolean[] arr = new boolean[l+1];
        for (int i = 0; i < l+1; i++) {
            arr[i] = true;
        }
        for (int i = 0; i < m; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();
            for (int j = left; j <= right; j++) {
                arr[j] = false;
            }
        }
        int res = 0;
        for (int i = 0; i < l + 1; i++) {
            if(arr[i]) res++;
        }
        System.out.println(res);
    }
}
