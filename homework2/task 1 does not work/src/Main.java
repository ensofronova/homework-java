import java.util.Scanner;
import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату: ");
        String s=scanner.nextLine();
        int k=0;
        String pattern1 ="^(0?\\d | 1\\d | 2\\d | 3[0-1]) \\/ (0?[13578] | 1[02]) \\/ ([2-9]\\d\\d\\d | 19\\d\\d)$";
        Pattern p1 = Pattern.compile(pattern1);
        Matcher m1 = p1.matcher(s);
        if (m1.matches()) {
            k++;
        }
        String pattern2 = "^(0?\\d | 1\\d | 2\\d | 30) \\/ (0?[469] | 11) \\/ ([2-9]\\d\\d\\d | 19\\d\\d)$";
        Pattern p2 = Pattern.compile(pattern2);
        Matcher m2 = p2.matcher(s);
        if (m2.matches()) {
            k++;
        }
        String pattern3 = "^(0?\\d | 1\\d | 2[0-8]) \\/ 12 \\/ ([2-9]\\d\\d\\d | 19\\d\\d)$";
        Pattern p3 = Pattern.compile(pattern3);
        Matcher m3 = p3.matcher(s);
        if (m3.matches()) {
            k++;
        }
        if (k>0)
            System.out.println("Введенное выражение является датой.");
        else
            System.out.println("Введенное выражение не является датой.");
    }
}