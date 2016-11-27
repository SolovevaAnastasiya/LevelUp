import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FindSummArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива:");
        int length = scanner.nextInt();
        System.out.println("Введите границу случайных чисел:");
        int upperBorder = scanner.nextInt();
        int[] array = RandomArrayGenerator(length, upperBorder);
        System.out.println(Arrays.toString(array));
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма элементов массива = " + sum);

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
