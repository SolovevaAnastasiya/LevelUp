import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomIntArrayMaxMinAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива:");
        int length = scanner.nextInt();
        System.out.println("Введите границу случайных чисел:");
        int upperBorder = scanner.nextInt();
        int[] array = RandomArrayGenerator(length, upperBorder);
        System.out.println(Arrays.toString(array));
        int min = findMin(array);
        int max = findMax(array);
        double average = findAverage(array);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("Среднее арифметическое элементов массива = " + average);

    }

    private static int[] RandomArrayGenerator(int length, int upperBorder) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(upperBorder);
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static double findAverage(int[] array) {
        double sum = 0;
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / array.length;
        return average;

    }

}
