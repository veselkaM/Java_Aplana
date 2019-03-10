package homework;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение в первую переменную");
        String stringFirst = scanner.nextLine();

        System.out.println("Введите значение во вторую переменную");
        String stringSecond = scanner.nextLine();

        int lenFirst = stringFirst.length();
        int lenSecond = stringSecond.length();

        if (lenFirst > lenSecond) {
            System.out.println(stringFirst);
        } else if (lenFirst < lenSecond) {
            System.out.println(stringSecond);
        } else {
            System.out.println("Переменные равны");
        }

    }
}
