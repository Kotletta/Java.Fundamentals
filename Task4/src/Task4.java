import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner k = new Scanner (System.in);
        System.out.println("Введите два целых числа, через пробел");
        int x1 = k.nextInt();
        int x2 = k.nextInt();
        System.out.println("Сумма = : " + (x1 + x2));
        System.out.println("Произведение = : " + (x1 * x2));

    }
}
