package homework;

import java.util.Scanner;

public class FinalTask03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текущий курс доллара к рублю: ");
        double course = scanner.nextDouble();

        System.out.println("Введите количество рублей: ");
        double rub = scanner.nextDouble();

        double result = rub/course;

        System.out.printf("Количество долларов по текущему курсу " + "%.2f",result);
    }
}
