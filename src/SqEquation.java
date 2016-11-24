import java.util.Scanner;

public class SqEquation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Решение квадратного уравнения типа a*x^2+b*x+c=0");
        while (true) {
            System.out.println("Введите a:");
            double a = readDouble(scanner);
            System.out.println("Введите b:");
            double b = readDouble(scanner);
            System.out.println("Введите c:");
            double c = readDouble(scanner);
            System.out.println("Введенные числа а=" + a + " b=" + b + " c=" + c);
            if (a != 0) {
                double Dis = (b * b - 4 * a * c);
                if (Dis >= 0) {
                    double x1 = (-b + Math.sqrt(Dis)) / (2 * a);
                    double x2 = (-b - Math.sqrt(Dis)) / (2 * a);
                    if ((x1 != 0 && x2 != 0) && x1 != x2) {
                        System.out.print("2 корня  ");
                        System.out.printf("%.7f ", Math.max(x1, x2));
                        System.out.printf("%.7f ", Math.min(x1, x2));
                    } else if ((x1 != 0 && x2 != 0) && x1 == x2) {
                        System.out.print("1 корень  ");
                        System.out.printf("%.7f ", x1);
                    } else if (x1 == 0) {
                        System.out.print("1 корень  ");
                        System.out.printf("%.7f ", x2);
                    } else if (x2 == 0) {
                        System.out.print("1 корень   ");
                        System.out.printf("%.7f ", x1);
                    }
                    break;
                } else {
                    System.out.println("Дискриминант D<0, уравнение не имеет решений");
                }
            } else {
                System.out.println("а=0, деление на 0 запрещено");
            }

        }

    }

    private static double readDouble(Scanner scanner) {
        double n;
        while (true) {
            if (scanner.hasNextDouble()) {
                n = scanner.nextDouble();
                if (Double.isFinite(n)) {
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
