import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r=1;
        int n=1;
        float x=1;
        float y=1;
        int k=0;
        System.out.print("Введите радиус: ");
        while (!scanner.hasNext("quit")) {
            if (scanner.hasNextInt()) {
                r = scanner.nextInt();}
                if (r<=0)
                    System.out.print("Ошибка! Радиус не может быть отрицательным!");
            else {
                System.out.println("Ошибка! Введите корректное число!");
                scanner.next();
            }
        }
        scanner.next();
        System.out.print("Введите количество точек: ");
        while (!scanner.hasNext("quit")) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();}
                if (n<=0)
                    System.out.print("Ошибка! Количество не может быть отрицательным!");
            else {
                System.out.println("Ошибка! Введите корректное число!");
                scanner.next();
            }
        }
        scanner.next();
        for (int i=1;i<=n;i++) {
            System.out.print("Введите координату х: ");
            while (!scanner.hasNext("quit")) {
                if (scanner.hasNextFloat()) {
                    x = scanner.nextFloat();}
                else {
                    System.out.println("Ошибка! Введите корректное число!");
                    scanner.next();
                }
            }
            scanner.next();
            System.out.print("Введите координату у: ");
            while (!scanner.hasNext("quit")) {
                if (scanner.hasNextFloat()) {
                    y = scanner.nextFloat();
                }
                else {
                    System.out.println("Ошибка! Введите корректное число!");
                    scanner.next();
                }
            }
            scanner.next();
            }
            if (x*x+y*y<=r*r) {
                k++;
            }
        System.out.println("Такое количество точек попадает в круг: "+k);
    }
}