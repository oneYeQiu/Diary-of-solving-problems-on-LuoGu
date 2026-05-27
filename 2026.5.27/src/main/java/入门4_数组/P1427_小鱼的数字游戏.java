package 入门4_数组;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1427_小鱼的数字游戏 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        String str = sc.nextLine();
        String[] strArr = str.split(" ");
        for(String s : strArr){
            list.add(Integer.valueOf(s));
        }
        for (int i = list.size() - 2; i >= 0; i--) {
            System.out.printf(list.get(i) + " ");
        }
    }
}
