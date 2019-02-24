package homework;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение в строковую переменную, которое содержит пробел: ");
        String str = scanner.nextLine();
        System.out.println(str.replaceAll(" ",
                ""));


    }
}
