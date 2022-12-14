import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int array_size=2;
        float array[] = new float[array_size];
        float k=0;
        float s=0;

        System.out.println("Введите элементы массива: ");

        for(int i=0;i<array_size;i++){
            while (!in.hasNext("quit"))
            {
                if (in.hasNextFloat()) {
                    array[i]=in.nextFloat();
                }
                else
                {
                    System.out.println("Ошибка! Введите коректное число");
                    in.next();
                }
            }
            in.next();
        }

        while (!in.hasNext("quit"))
        {
            float arrayTemp[] = new float[array.length];

            for (int i = 0; i < array.length; i++) {
                arrayTemp[i] = array[i];
            }

            array = new float[arrayTemp.length + 1];

            for (int i = 0; i < arrayTemp.length; i++) {
                array [i] = arrayTemp[i];
            }
            while (!in.hasNext("quit"))
            {
                if (in.hasNextFloat()) {
                    array[array.length-1]=in.nextFloat();
                }
                else
                {
                    System.out.println("Ошибка! Введите коректное число");
                    in.next();
                }
            }
            in.next();
        }

        in.next();

        System.out.println("Ваш массив: ");

        for(float elem:array)
            System.out.print(elem +" ");

        System.out.println();

        float arrays[] = new float[array.length];

        for (int i=0; i<array.length; i++)
        {
            for (int j=0; j<=i; j++)
            {
                k=k+array[j];
            }
            s=k/(i+1);
            arrays[i]=s;
            s=0;
            k=0;
        }

        System.out.println("Сглаженный массив: ");

        for(float elem:arrays)
            System.out.print(elem +" ");

        in.close();
    }
}