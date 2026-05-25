package 入门2_分支结构;

import java.util.Scanner;

public class P5714_深基3例7_肥胖问题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        double h = sc.nextDouble();
        double result = m / (h*h);
        if(result < 18.5){
            System.out.println("Underweight");
        }else if (result < 24){
            System.out.println("Normal");
        }else {
            System.out.printf("%.6g\n", result);
            System.out.println("Overweight");
        }
    }
}
