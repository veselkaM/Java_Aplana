package homework;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Ввод числа с клавиатуры и запись его в строковую переменную S
        System.out.println("Введите целое число");
        String s = scanner.nextLine();

        //2. Конвертация строковой переменной S в числовую переменную X типа int
        int x = 0;
        try {
            x = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }

        //3. Конвертация числа X типа int в число Y типа double
        double y = x;

        System.out.println(s + "\n" + x + "\n" + y);


    }
}
