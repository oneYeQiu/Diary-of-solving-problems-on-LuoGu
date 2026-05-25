package 入门2_分支结构;

import java.util.Scanner;

public class P5712_深基3例4_Apples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int apple = sc.nextInt();
        if(apple > 1){
            System.out.println("Today, I ate " + apple + " apples.");
        }else if(apple == 1){
            System.out.println("Today, I ate 1 apple.");
        }else {
            System.out.println("Today, I ate 0 apple.");
        }
    }
}
