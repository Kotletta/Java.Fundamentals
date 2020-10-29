import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.*;

public class parag1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите n-ое количество чиcел. Закончите ввод чисел и начните их сортировку, вводом любого символа");
        ArrayList mynumbers = new ArrayList();

        while (scan.hasNextInt() == true) {
            int number = scan.nextInt();
            mynumbers.add(number);
            System.out.println("Вы ввели число: " + number + " P.S. Что бы закончить ввод чисел, введите любой символ");
        }
        while (scan.hasNextInt() == false) {

            System.out.println("Ввод чисел окончен, выполняется сортировка по возростанию");
            break;
        }
        scan.close();

        Collections.sort(mynumbers);
        System.out.println("Сортировка по возростанию выполнена: " + mynumbers);

    }
}
