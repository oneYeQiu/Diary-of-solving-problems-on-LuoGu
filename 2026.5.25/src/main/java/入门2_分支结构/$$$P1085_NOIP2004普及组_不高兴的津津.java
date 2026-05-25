package 入门2_分支结构;
// todo 错误
import java.util.*;

public class $$$P1085_NOIP2004普及组_不高兴的津津 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxWalk = 0;
        int maxDay = 0;
        for (int day = 0; day < 7; day++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a+b;
            if(sum > 8){
                if((sum-8) > maxWalk){
                    maxWalk = sum-8;
                    maxDay = day+1;
                }
            }
        }
        System.out.println(maxDay);

    }
    // todo
//
//    import java.util.Scanner;
//
//    public class Main {
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            int[][] arr = new int[7][2];
//
//            for (int i = 0; i < 7; i++) {
//                int re = 0;
//                for (int j = 0; j < 2; j++) {
//                    arr[i][j] = sc.nextInt();
//                    re += arr[i][j];
//                }
//                if(re > 8) {
//                    System.out.println(i+1);
//                    return;
//                }
//            }
//            System.out.println(0);
//
//        }
//    }


}
