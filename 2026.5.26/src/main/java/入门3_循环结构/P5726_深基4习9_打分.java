package 入门3_循环结构;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P5726_深基4习9_打分 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        list.sort(null);
        list.remove(n-1);
        list.remove(0);
        for (int i : list){
            sum += i;
        }
        System.out.printf("%.2f", sum / ((n-2)*1.0));
    }
}
