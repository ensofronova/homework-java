import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату: ");
        String s=scanner.nextLine();
        int k=0;
        String pattern1 ="[0-3][0-9]\\/[0-1][0-9]\\/[0-9][0-9][0-9][0-9]";
        Pattern p1 = Pattern.compile(pattern1);
        Matcher m1 = p1.matcher(s);
        String pattern2 ="[0-3][0-9]\\.[0-1][0-9]\\.[0-9][0-9][0-9][0-9]";
        Pattern p2 = Pattern.compile(pattern2);
        Matcher m2 = p2.matcher(s);
        if (m1.matches())
            System.out.println("Введенное выражение является датой.");
        else
        {
            if (m2.matches())
                System.out.println("Введенное выражение не соответствует заданному формату даты dd/mm/yyyy.");
            else
                System.out.println("Введенное выражение не является датой.");
        }
    }
}