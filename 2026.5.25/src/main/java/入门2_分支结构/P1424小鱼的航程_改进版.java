package 入门2_分支结构;

// todo 通过了 但我还是有点懵！ 写的代码太乱了 感觉像硬凑的
import java.util.Scanner;

public class P1424小鱼的航程_改进版 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        // 如果不是在本周，则把当天的日期加到周1，然后判断有几个整周，如果最后一周不够7天 再自行判断计算。
        if(x+n >= 7){
            int num1 = n - (8-x);
            int num2 = num1 / 7;
            int num3 = num1 % 7;
            int result = 0;
            if(x > 5){

            }else {
                result += (5-x+1)*250;
            }
            result += num2 * 250*5;
            if(num3 > 5){
                result += 250*5;
            }else {
                result += num3*250;
            }
            System.out.println(Math.max(result, 0));
        }else {
            if(x+n > 5){
                System.out.println((5 - x) * 250);
            }else {
                System.out.println(n * 250);
            }
        }


    }
}
