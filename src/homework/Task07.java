package homework;


import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

        double x = 22.00;
        double y = 22.00;
        double z = 23.00;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        double t = scanner.nextDouble();

        if (t==x | t==y | t==z) {
            System.out.println("Данное значение имеется в константах");
        } else {
            System.out.println("Такой константы нет!");
        }

    }
}
