import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day=0;
        int month=0;
        int year=0;
        int m;
        System.out.print("Введите день Вашего рождения: ");
        while (!scanner.hasNext("quit")) {
            if (scanner.hasNextInt()) {
                day = scanner.nextInt();
                if ((day>31) | (day<0))
                    System.out.print("Ошибка! В месяце не бывает такого числа!");}
            else {
                System.out.println("Ошибка! Введите корректное число!");
                scanner.next();
            }
        }
        scanner.next();

        System.out.print("Введите месяц Вашего рождения: ");
        while (!scanner.hasNext("quit")) {
            if (scanner.hasNextInt()) {
                month = scanner.nextInt();
                if ((month>12) | (month<0))
                    System.out.print("Ошибка! В году не бывает такого месяца!");}
            else {
                System.out.println("Ошибка! Введите корректное число!");
                scanner.next();
            }
        }
        scanner.next();
        System.out.print("Введите год Вашего рождения: ");
        while (!scanner.hasNext("quit")) {
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                if ((year>2022) | (year<0))
                    System.out.print("Ошибка! Этот год ещё не наступил!");}
            else {
                System.out.println("Ошибка! Введите корректное число!");
                scanner.next();
            }
        }
        scanner.next();
        m=month;
        if ((25-day)<0) {
            day=31+(25-day);
            month=12+(11-month)-1;
        }
        else {
            day=25-day;
            month=12+(11-month);
        }
        if ((11-m)<=0) {
            if ((2022 - year) <= 0)
                System.out.print("Ошибка! Введённая вами дата еще не наступила, измените год!");
            while (!scanner.hasNext("quit")) {
                if (scanner.hasNextInt()) {
                    year = scanner.nextInt();
                    if (year > 2022)
                        System.out.print("Ошибка! Этот год ещё не наступил!");
                } else {
                    System.out.println("Ошибка! Введите корректное число!");
                    scanner.next();
                }
            }
            year = 2022 - year - 1;
        }
        else
            year=2022-year;
        System.out.println("Вам "+year+" лет "+month+" месяцев "+day+" дней.");
    }
}
