import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int array_size = 2;
        int array[] = new int[array_size];
        int x = 0;
        int k = 0;

        System.out.println("Введите элементы массива: ");

        for (int i = 0; i < array_size; i++) {
            while (!in.hasNext("quit")) {
                if (in.hasNextInt()) {
                    array[i] = in.nextInt();
                } else {
                    System.out.println("Ошибка! Введите коректное число");
                    in.next();
                }
            }
            in.next();
        }

        while (!in.hasNext("quit")) {
            int arrayTemp[] = new int[array.length];

            for (int i = 0; i < array.length; i++) {
                arrayTemp[i] = array[i];
            }

            array = new int[arrayTemp.length + 1];

            for (int i = 0; i < arrayTemp.length; i++) {
                array[i] = arrayTemp[i];
            }
            while (!in.hasNext("quit")) {
                if (in.hasNextInt()) {
                    array[array.length - 1] = in.nextInt();
                } else {
                    System.out.println("Ошибка! Введите коректное число");
                    in.next();
                }
            }
            in.next();
        }

        in.next();

        System.out.println("Ваш массив: ");

        for (int elem : array)
            System.out.print(elem + " ");

        System.out.println();

        System.out.println("Введите число, которое нужно удалить из массива: ");

        while (!in.hasNext("quit")) {
            if (in.hasNextInt()) {
                x = in.nextInt();
            } else {
                System.out.println("Ошибка! Введите коректное число");
                in.next();
            }
        }

        int arrays[] = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {

                int arrayTemp[] = new int[arrays.length];

                for (int j = 0; j < arrays.length; j++) {
                    arrayTemp[j] = arrays[j];
                }

                arrays = new int[arrayTemp.length - 1];

                for (int w = 0; w < arrayTemp.length - 1; w++) {
                    arrays[w] = arrayTemp[w];
                }
            }
            else {
                arrays[k] = array[i];
                k++;
                }
            }

            System.out.println("Полученный массив: ");

            for (int elem : arrays)
                System.out.print(elem + " ");

            in.close();
        }
    }
