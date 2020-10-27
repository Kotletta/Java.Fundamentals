import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        System.out.println("Введите число от 1 до 12");

        int x = k.nextInt();

        if (x == 1) {
            System.out.println("Январь");
        }
        else if (x == 2) {
            System.out.println("Февраль");
        }
        else if (x == 3) {
            System.out.println("Март");
        }
        else if (x == 4) {
            System.out.println("Аперль");
        }
        else if (x == 5) {
            System.out.println("Май");
        }
        else if (x == 6) {
            System.out.println("Июнь");
        }
        else if (x == 7) {
            System.out.println("Июль");
        }
        else if (x == 8) {
            System.out.println("Август");
        }
        else if (x == 9) {
            System.out.println("Сентябрь");
        }
        else if (x == 10) {
            System.out.println("Октябрь");
        }
        else if (x == 11) {
            System.out.println("Ноябрь");
        }
        else if (x == 12) {
            System.out.println("Декабрь");
        }
        else
                System.out.println("Неверное число");

    }
}
