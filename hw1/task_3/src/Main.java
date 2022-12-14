import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x=0;
        int n=0;
        float a=1;
        int b=1;
        System.out.print("Введите основание: ");
        while (!scanner.hasNext("quit")) {
            if (scanner.hasNextInt()) {
                x = scanner.nextInt();}
            else {
                System.out.println("Ошибка! Введите корректное число!");
                scanner.next();
            }
        }
        scanner.next();
        System.out.print("Введите степень: ");
        while (!scanner.hasNext("quit")) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if ((-15>n) &(n > 31))
                    System.out.print("Ошибка! Введите число от -15 до 15!");
            } else {
                System.out.println("Ошибка! Введите корректное число!");
                scanner.next();
            }
        }
        scanner.next();
        if (n<0)
            b=n*(-1);
        for (int i=1;i<=b;i++) {
            a = a * x;
        }
        if (n>=0)
            System.out.println(a);
        else
            System.out.println(1/a);

}}