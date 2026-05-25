package 入门2_分支结构;
// todo 错误

import java.util.Scanner;

public class P1055_NOIP2008普及组_ISBN号码 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String isbn = sc.next();
        String[] parts = isbn.split("-");

        int sum = 0;
        int weight = 1; // 乘数 1~9
        // 处理前三个部分（共9位数字）
        for (int i = 0; i < parts.length - 1; i++) {
            String part = parts[i];
            for (int j = 0; j < part.length(); j++) {
                int digit = part.charAt(j) - '0';
                sum += digit * weight;
                weight++;
            }
        }

        // 计算正确的识别码
        int mod = sum % 11;
        char correctCode = (mod == 10) ? 'X' : (char) ('0' + mod);

        // 获取输入的识别码（最后一位）
        char inputCode = isbn.charAt(isbn.length() - 1);

        if (inputCode == correctCode) {
            System.out.println("Right");
        } else {
            // 替换最后一位为正确识别码
            String correctIsbn = isbn.substring(0, isbn.length() - 1) + correctCode;
            System.out.println(correctIsbn);
        }

        sc.close();
    }
}



//import java.util.Scanner;
//
//public class P1055_NOIP2008普及组_ISBN号码 {
//
//    public static int[] strToIntarr(String str){
//        char[] charArray = str.toCharArray();
//        int[] arr = new int[charArray.length];
//        for (int i = 0; i < charArray.length; i++) {
//            arr[i] = charArray[i] - '0';
//        }
//        return arr;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        String[] strArr = str.split("-");
//        int tem = 1;
//        int result = 0;
//        String res = "";
//        int biaoshi = 0;
//        for (int i = 0; i < strArr.length; i++) {
//            int[] ints = strToIntarr(strArr[i]);
//            if(i == strArr.length - 1){
//                biaoshi = ints[0];
//                break;
//            }
//            for (int j = 0; j < ints.length; j++) {
//                result += ints[j] * tem;
//            }
//        }
//        int num = result % 11;
//        if(num  == biaoshi){
//            System.out.println("Right");
//        }else {
//            String temBiaoshi = str.substring(str.length() - 1);
//            res = str.substring(0,str.length()-1) + num;
//            System.out.println(res);
//        }
//
//    }
//}
