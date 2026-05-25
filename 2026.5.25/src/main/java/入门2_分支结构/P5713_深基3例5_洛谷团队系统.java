package 入门2_分支结构;

import java.util.Scanner;

public class P5713_深基3例5_洛谷团队系统 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num1 = n * 5;
        int num2 = n * 3 + 11;
        if(num1 < num2){
            System.out.println("Local");
        }else {
            System.out.println("Luogu");
        }
    }
}
