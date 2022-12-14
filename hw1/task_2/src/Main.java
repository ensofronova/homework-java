import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = 0;
        int month = 0;
        String seasonString="";
        System.out.print("Введите день: ");
        while (!scanner.hasNext("quit")) {
            if (scanner.hasNextInt()) {
                day = scanner.nextInt();
                if ((day > 31)| (day<0))
                    System.out.print("Ошибка! В месяце не существует такого числа!");
            } else {
                System.out.println("Ошибка! Введите корректное число!");
                scanner.next();
            }
        }
        scanner.next();
        System.out.print("Введите месяц: ");
        while (!scanner.hasNext("quit")) {
            if (scanner.hasNextInt()) {
                month = scanner.nextInt();
                if ((month > 12) | (month<0))
                    System.out.print("Ошибка! В году не существует такого месяца!");
            } else {
                System.out.println("Ошибка! Введите корректное число!");
                scanner.next();
            }
        }
        scanner.next();
        switch (month) {
            case 12, 1, 2:
                seasonString = "Зима";
                break;
            case 3, 4, 5:
                seasonString = "Весна";
                break;
            case 6, 7, 8:
                seasonString = "Лето";
                break;
            case 9, 10, 11:
                seasonString = "Осень";
                break;
        }
        System.out.println(seasonString);
    }
}
