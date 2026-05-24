import java.util.Scanner;
// todo 错误
public class P5707_深基2例12_上学迟到 {

// todo 正确答案
    //    import java.util.Scanner;
//
//    public class Main {
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            int s = sc.nextInt();
//            int v = sc.nextInt();
//            // 走路所需分钟数（向上取整）
//            int walkMinutes = (s + v - 1) / v;   // 等效于 ceil(s/v)
//            int totalMinutes = walkMinutes + 10;
//            int startMinutes = 8 * 60 - totalMinutes;
//            if (startMinutes < 0) {
//                startMinutes += 24 * 60;
//            }
//            System.out.printf("%02d:%02d", startMinutes / 60, startMinutes % 60);
//        }
//    }

    private static String change(int min){
        int h = min / 60;
        int m = min % 60;
        String result;
        if(h >= 10){
            if(m >= 10){
                result = String.valueOf(h) + ":" + java.lang.String.valueOf(m);
            }else {
                result = String.valueOf(h) + ":" + "0" + java.lang.String.valueOf(m);
            }
        }else {
            if(m >= 10){
                result = "0" + String.valueOf(h) + ":" + java.lang.String.valueOf(m);
            }else {
                result = "0" + String.valueOf(h) + ":" + "0" + java.lang.String.valueOf(m);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int v = sc.nextInt();
        int num1 = ((8+24) * 60) - 10;
        int num2 = s/v;
        if(s%v != 0){
            num2 += 1;
        }
        if(num1 - num2 > 24*60){
            int num3 = (num1-num2) - 24*60;
            System.out.println(change(num3));
        }else {
            int num4 = (num1-num2) - 24*60;
            System.out.println(change(num4));
        }
    }




}
