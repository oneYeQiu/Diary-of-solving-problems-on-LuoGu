package 入门3_循环结构;

import java.util.Scanner;

public class P4956_COCI_2017_2018_6_Davor {
//    todo 更优的解法 逻辑清晰 更优秀的解法（无需循环，纯数学） 法1：

//    import java.util.Scanner;
//
//    public class Main {
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            int N = sc.nextInt();
//            int M = N / 364;      // M = X + 3K
//
//            // 求最小的 K 使得 X = M - 3K ≤ 100 且 X ≥ 1
//            // 由 M - 3K ≤ 100  => K ≥ (M-100)/3
//            int K = (int) Math.ceil((M - 100) / 3.0);
//            if (K < 1) K = 1;     // K 至少为 1
//
//            // 确保 X = M - 3K 是正整数（题目保证有解，无需额外检查）
//            int X = M - 3 * K;
//
//            System.out.println(X);
//            System.out.println(K);
//        }
//    }


//    int M = N / 364;
//    int K = Math.max(1, (M - 100 + 2) / 3);   // todo  // 整数向上取整技巧
//    int X = M - 3 * K;
//System.out.println(X + "\n" + K);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N == 1456){
            System.out.println(1);
            System.out.println(1);
        }else {
            int tem = N-1456;
            int num1 = tem/364;
            int res2 = 0;
            if(num1 > 99){
                while (true){
                    num1 -= 3;
                    res2++;
                    if(num1 < 100) break;
                }
            }
            System.out.println(num1+1);
            System.out.println(res2+1);
        }
    }
}
