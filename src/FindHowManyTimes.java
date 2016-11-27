import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FindHowManyTimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива:");
        int length = scanner.nextInt();
        System.out.println("Введите границу случайных чисел:");
        int upperBorder = scanner.nextInt();
        int[] array = RandomArrayGenerator(length, upperBorder);
        System.out.println(Arrays.toString(array));
        System.out.println("Введите значение для поиска в массиве");
        int value = scanner.nextInt();
        int t = 0;
        for (int x : array) {
            if (x == value) {
                t = t + 1;
            }
        }
        System.out.println("Значение = " + value+" встречается "+t+" раз" );


    }


    private static int[] RandomArrayGenerator(int length, int upperBorder) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(upperBorder);
        }
        return array;
    }
}

