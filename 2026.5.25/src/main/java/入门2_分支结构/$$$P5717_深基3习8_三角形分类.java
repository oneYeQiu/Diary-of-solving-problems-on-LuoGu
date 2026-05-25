package 入门2_分支结构;
// todo a+b <= c 是无法构成三角形 ， 缺少了 = 。
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class $$$P5717_深基3习8_三角形分类 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(sc.nextInt());
        }
        list.sort(null);
        int a = list.get(0);
        int b = list.get(1);
        int c = list.get(2);
        if(a + b <= c){
            System.out.println("Not triangle");
            return;
        }
        if ((a*a + b*b) == c*c) {
            System.out.println("Right triangle");
        }
        if ((a*a + b*b) > c*c) {
            System.out.println("Acute triangle");
        }
        if ((a*a + b*b) < c*c) {
            System.out.println("Obtuse triangle");
        }
        if (a == b || b == c){
            System.out.println("Isosceles triangle");
        }
        if (a == b && b == c) {
            System.out.println("Equilateral triangle");
        }
    }
}
