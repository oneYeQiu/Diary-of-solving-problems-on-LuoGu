package 入门4_数组;

import java.util.Scanner;

public class P5727_深基5例3_冰雹猜想 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String res = "";
        res += n;

        while (n != 1){
            if(n % 2 == 0){
                n /= 2;
            }else {
                n = (n * 3 + 1);
            }
            res += " ";
            res += n;
        }
        String[] strArr = res.split(" ");
        for (int i = strArr.length - 1; i >= 0; i--) {
            System.out.print(strArr[i] + " ");
        }
    }
}
