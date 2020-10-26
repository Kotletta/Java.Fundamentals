import java.util.Scanner;

public class Task2code {
    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        System.out.println("Введите любую фразу");
        String slovo = k.nextLine();
        String reverse = new StringBuffer(slovo).reverse().toString();
        System.out.println("Вывод строки в обрытном порядке: " + reverse);
    }
}