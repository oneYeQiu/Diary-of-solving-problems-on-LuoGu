package 入门3_循环结构;
// todo 高精度 用BigDecimal
import java.math.BigDecimal;
import java.util.Scanner;

public class P1009_NOIP1998普及组_阶乘之和 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigDecimal res = new BigDecimal(0);
        for (int i = 1; i <= n; i++) {
            BigDecimal tem = new BigDecimal(1);
            for (int j = 1; j <= i; j++) {
                tem = tem.multiply(new BigDecimal(j));
            }
            res = res.add(tem);
        }
        System.out.println(res);
    }
}
