package 入门2_分支结构;

import java.util.Scanner;

public class P4414_COC_2006_2007_2_ABC {

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
        String str = sc.next();
        char[] arr2 = str.toCharArray();
        int[] arr = sort(a, b, c);
        for (int i = 0; i < 3; i++) {
            if(arr2[i] == 'A'){
                System.out.print(arr[0] + " ");
            } else if (arr2[i] == 'B') {
                System.out.print(arr[1] + " ");
            } else if (arr2[i] == 'C') {
                System.out.print(arr[2] + " ");
            }
        }
    }
}
