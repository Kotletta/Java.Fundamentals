import java.util.Scanner;

public class log {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите n-ое количество чиcел");
        String numbers = scan.nextLine();
        System.out.println("Вы ввели числа: " + numbers);
        String longWord = "", shortWord = numbers;
        for (String size : numbers.split(" ")) {
            if (size.length() > longWord.length()) longWord = size;
            if (size.length() < shortWord.length()) shortWord = size;
        }
        System.out.println("Самое длинное число: " + longWord + " Длинна этого числа: " + longWord.length());
        System.out.println("Самое короткое числ: "+ shortWord + " Длинна этого числа: " + shortWord.length());

    }
}













