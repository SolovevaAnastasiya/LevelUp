import java.util.Scanner;

public class LnEquation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Решение линейного уравнения типа a*x+b=0");
        while (true) {
            System.out.println("Введите a:");
            double a = readDouble(scanner);
            System.out.println("Введите b:");
            double b = readDouble(scanner);
            System.out.println("Введенные числа а=" + a + " b=" + b);
            if (a != 0) {
                double x = -b / a;
                System.out.println("Решение уравнения х=" + x);
                final double EPS = 1e-12;
                if (Math.abs(a * x + b) < EPS) {
                    System.out.println("х найден верно");
                    break;
                } else {
                    System.out.println("x не подходит, проверьте решение");
                }
            } else {
                System.out.println("а=0, деление на 0 запрещено");
            }
        }

    }

    private static double readDouble(Scanner scanner) {
        while (true) {
            if (scanner.hasNextDouble()) {
                double n = scanner.nextDouble();
                if (Double.isFinite(n)) {
                    System.out.println("значение = " + n);
                    return n;
                } else {
                    System.out.println("Вы ввели не число. Введите число:");
                }

            } else {
                System.out.println("Вы ввели не число. Введите число:");
                scanner.next();


            }
        }
    }
}
