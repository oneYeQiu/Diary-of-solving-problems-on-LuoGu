package 入门2_分支结构;
// todo 错误 你的代码主要问题在于：当用电量不超过150度时，第二段电量 num2 没有被清零，仍然保留了初始值250，导致多算了电费
import java.util.Scanner;

public class $$$P1422_小玉家的电费 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num1 = 150;
        int num2 = 0;
        int num3 = 0;
        if(n > 150){
            if(n > 400){
                num2 = 250;
                num3 = n - 400;
            }else {
                num2 = n - 150;
            }
        }else {
            num1 = n;
        }

        double result = num1*0.4463 + num2*0.4663 + num3* 0.5663;
        System.out.printf("%.1f",result);

    }
}
