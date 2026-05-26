package 入门3_循环结构;
// todo 超时了
import java.util.Scanner;

public class P1217_USACO1_5_回文质数_PrimePalindromes {

    public static boolean isPalindromeByString(int x) {
        String s = Integer.toString(x);
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }

    public static boolean isPrime(int n){
        if(n < 2) return false;
        else {
            for (int i = 2; i*i <= n; i++) {
                if(n % i == 0) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if(isPalindromeByString(i)){
                if(isPrime(i)){
                    System.out.println(i);
                }
            }
        }

    }
}
