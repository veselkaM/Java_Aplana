package homework;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        String s = scanner.nextLine();


        try {
            double y = Double.parseDouble(s);
            int x = (int) Math.round(y);
            y = x;
            System.out.println(s + "\n" + x + "\n" + y);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат числа!");
        }


    }
}
