import java.util.Random;
import java.util.Scanner;

public class Task3code {
    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        System.out.println("Введите любое число");
        int x = k.nextInt();
        System.out.print("Вывод чисел без перехода на новую строку: ");
        for (int i = 0; i < x; i++) {
            Random r = new Random();
            int chislo = r.nextInt(100);
            System.out.print(chislo + " ");
        }
        System.out.println();

        System.out.println("Вывод чисел c переходом на новую строку: ");
        for (int i = 0; i < x; i++) {
            Random r = new Random();
            int chislo = r.nextInt(100);
            System.out.println(chislo);
        }


    }

}