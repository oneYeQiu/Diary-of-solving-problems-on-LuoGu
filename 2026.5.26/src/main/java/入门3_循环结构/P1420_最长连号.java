package 入门3_循环结构;
// todo 不会
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P1420_最长连号 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxlen = 1;
        int curlen = 1;
        for (int i = 1; i < n; i++) {
            if(arr[i] == arr[i-1] + 1){
                curlen++;
            }else {
                curlen = 1;
            }
            maxlen = Math.max(maxlen,curlen);
        }
        System.out.println(maxlen);
    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int res = 0;
//        int num = 0;
//        Map<Integer, Integer> map = Collections.emptyMap();
//        for (int i = 0; i < n; i++) {
//            int tem = sc.nextInt();
//            if(map.get(tem) == null){
//                map.put(tem,1);
//            }else {
//                map.put(tem,map.get(tem)+1);
//            }
//        }
//        for(Integer v : map.values()){
//            num = Math.max(v,num);
//        }
//        for(Integer key : map.keySet()){
//            if(map.get(key) == num){
//                res = key;
//            }
//        }
//        System.out.println(res);
//    }
}
