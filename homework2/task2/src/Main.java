import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k=0;
        while (k==0)
        {
            System.out.println("Введите пароль: ");
            String s=scanner.nextLine();
            String pattern = "^(?=\\w*\\d)(?=\\w*[a-z])(?=\\w*[A-Z]).{8,}$";
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(s);
            if (m.matches()==false)
                System.out.println("Пароль ненадёжен, повторите ввод.");
            else
                k++;
        }
        System.out.println("Пароль надёжен.");

    }
}