import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String pharase = name.nextLine();
        System.out.println("Доброго времени суток - " + pharase);

    }
}
