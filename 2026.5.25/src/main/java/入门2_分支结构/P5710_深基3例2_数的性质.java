package 入门2_分支结构;

import java.util.Scanner;

public class P5710_深基3例2_数的性质 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean a = false;
        boolean b = false;
        boolean c = false;
        boolean d = false;

        if(x % 2 == 0){
            b = true;
            d = false;
            if(x > 4 && x <= 12){
                a = true;
            }else {
                a = false;
                c = true;
            }
        }else {
            a = false;
            if(x > 4 && x <= 12){
                b = true;
                c = true;
            }else {
                d = true;
            }
        }
        System.out.print(a ? 1 : 0);
        System.out.print(" ");
        System.out.print(b ? 1 : 0);
        System.out.print(" ");
        System.out.print(c ? 1 : 0);
        System.out.print(" ");
        System.out.print(d ? 1 : 0);

    }
}
