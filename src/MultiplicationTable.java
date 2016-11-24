import java.util.Scanner;

public class MultiplicationTable {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Таблица умножения n * m ");
        System.out.println("Введите n:");
        int n= scanner.nextInt();
        System.out.println("Введите m:");
        int m=scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m ; j++) {
                System.out.printf("%5d",(i+1)*(j+1));
            }
            System.out.println();

        }

    }
}
