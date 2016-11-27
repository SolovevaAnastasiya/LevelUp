import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FindValue {

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
        for (int x:array) {
            if (x == value) {
                System.out.println("Значение " +value+"  найдено");
                return;
            }

        }System.out.println("Значение "+value+" не найдено");
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
