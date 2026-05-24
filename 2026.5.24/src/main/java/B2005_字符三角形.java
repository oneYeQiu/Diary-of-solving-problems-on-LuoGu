import java.util.Scanner;

public class B2005_字符三角形 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("  " + str + "  \n" +
                        " " + str + str + str + " \n" +
                str + str + str + str + str);
    }
}
