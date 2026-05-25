package 入门2_分支结构;

import java.sql.SQLOutput;
import java.util.Scanner;

public class P5716_深基3例9_月份天数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        if(m == 2){
            int d = isRunNian(y) ? 29 : 28;
            System.out.println(d);
        }else if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12){
            System.out.println(31);
        }else {
            System.out.println(30);
        }
    }

    public static boolean isRunNian(int y){
        if(y % 400 == 0){
            return true;
        }else if (y % 100 != 0 && y % 4 == 0){
            return true;
        }else {
            return false;
        }
    }

}
