import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubleSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива:");
        int length = scanner.nextInt();
        System.out.println("Введите границу случайных чисел:");
        int upperBorder = scanner.nextInt();
        int[] array = RandomArrayGenerator(length, upperBorder);
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(array));
        // сортировка пузырьком
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }

        }
        System.out.println("Упорядоченный массив:");
        System.out.println(Arrays.toString(array));

    }

    private static int[] RandomArrayGenerator(int length, int upperBorder) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt() % upperBorder;
        }
        return array;
    }

}
