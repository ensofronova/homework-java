import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int array_size = 2;
        float array[] = new float[array_size];
        int k = 1;

        System.out.println("Введите элементы массива: ");

        for (int i = 0; i < array_size; i++) {
            while (!in.hasNext("quit")) {
                if (in.hasNextFloat()) {
                    array[i] = in.nextFloat();
                } else {
                    System.out.println("Ошибка! Введите коректное число");
                    in.next();
                }
            }
            in.next();
        }

        while (!in.hasNext("quit")) {
            float arrayTemp[] = new float[array.length];

            for (int i = 0; i < array.length; i++) {
                arrayTemp[i] = array[i];
            }

            array = new float[arrayTemp.length + 1];

            for (int i = 0; i < arrayTemp.length; i++) {
                array[i] = arrayTemp[i];
            }
            while (!in.hasNext("quit")) {
                if (in.hasNextFloat()) {
                    array[array.length - 1] = in.nextFloat();
                } else {
                    System.out.println("Ошибка! Введите коректное число");
                    in.next();
                }
            }
            in.next();
        }

        in.next();

        System.out.println("Ваш массив: ");

        for (float elem : array)
            System.out.print(elem + " ");

        System.out.println();


        float arrays[] = new float[array.length];

        arrays[0] = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i-1]>=array[i]) {

                float arrayTemp[] = new float[arrays.length];

                for (int j = 0; j < arrays.length; j++) {
                    arrayTemp[j] = arrays[j];
                }

                arrays = new float[arrayTemp.length - 1];

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

        for (float elem : arrays)
            System.out.print(elem + " ");

        in.close();
    }
}
