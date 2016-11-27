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
            if (a == 0) {
                if (b == 0) {
                    if (c == 0) {
                        System.out.println("-1");
                    } else {
                        System.out.println("0");
                    }
                } else {
                    double x = -c / b;
                    System.out.println("1 " + x);
                }
            } else {
                double Dis = (b * b - 4 * a * c);
                //final double EPS=1e-6;
                if (Dis < 0) {
                    System.out.println("0");
                } else if (Dis == 0) {
                    double x1 = -b /(2 * a);
                    System.out.println("1 " +x1);
                } else {
                    double x2 = (-b + Math.sqrt(Dis)) / (2 * a);
                    double x3 = (-b - Math.sqrt(Dis)) / (2 * a);
                    System.out.println("2 " + Math.min(x2, x3)+" " + Math.max(x2, x3));
                }

            } break;
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
