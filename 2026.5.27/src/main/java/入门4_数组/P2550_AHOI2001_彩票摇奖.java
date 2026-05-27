package 入门4_数组;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P2550_AHOI2001_彩票摇奖 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> priceArr = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            priceArr.add(sc.nextInt());
        }
        int[][] buyTicket = new int[n][7];
        int[] res = new int[7];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < 7; j++) {
                buyTicket[i][j] = sc.nextInt();
                if(priceArr.contains(buyTicket[i][j])){
                    count++;
                }
            }
            switch (count){
                case 7:
                    res[0]++;
                    break;
                case 6:
                    res[1]++;
                    break;
                case 5:
                    res[2]++;
                    break;
                case 4:
                    res[3]++;
                    break;
                case 3:
                    res[4]++;
                    break;
                case 2:
                    res[5]++;
                    break;
                case 1:
                    res[6]++;
                    break;
            }
        }

        for (int i = 0; i < 7; i++) {
            System.out.printf(res[i] + " ");
        }
    }
}
