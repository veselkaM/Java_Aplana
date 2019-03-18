package homework;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        String s = scanner.nextLine();


        try {
            int x = (int)Double.parseDouble(s);
            double y = (double) x;
            System.out.println(s + "\n" + x + "\n" + y);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат числа!");
        }
    }
}
