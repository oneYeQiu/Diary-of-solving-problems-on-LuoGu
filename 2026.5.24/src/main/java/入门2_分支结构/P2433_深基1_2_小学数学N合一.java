package 入门2_分支结构;

import java.util.Scanner;

public class P2433_深基1_2_小学数学N合一 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();
        switch (choose){
            case 1:
                System.out.println("I love Luogu!");
                break;
            case 2:
                System.out.println((2+4) + " " + (10-2-4));
                break;
            case 3:
                System.out.println(14 / 4);
                System.out.println(14 - (14%4));
                System.out.println(14%4);
                break;
            case 4:
                System.out.printf("%.6g",500.0 / 3);
                break;
            case 5:
                System.out.println(480 / 32);
                break;
            case 6:
                System.out.printf("%.6g",Math.sqrt(6*6 + 9*9));
                break;
            case 7:
                System.out.println(100 + 10);
                System.out.println(110 - 20);
                System.out.println(0);
                break;
            case 8:
                System.out.printf("%.6g\n",2 * 3.141593 * 5);
                System.out.printf("%.6g\n",3.141593 * 5 * 5);
                System.out.printf("%.6g\n",4.0/3 * 3.141593 * 5*5*5);
                break;
            case 9:
                System.out.println(22);
                break;
            case 10:
                System.out.println(9);
                break;
            case 11:
                System.out.printf("%.6g\n",100.0 / 3);
                break;
            case 12:
                System.out.println(13);
                System.out.println("R");
                break;
            case 13:
                double volume = 4/3.0 * 3.141593 * 4*4*4 + 4/3.0 * 3.141593 *10*10*10;
                System.out.println((int) Math.cbrt(volume));
                break;
            case 14:
                System.out.println(50);
                break;
        }
        sc.close();
    }
}
