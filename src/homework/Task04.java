package homework;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести число в бинарном формате: ");
        String bin = scanner.nextLine();

        int a = Integer.parseInt(bin, 2);
        System.out.printf("Получено число: %d \n", a);


    }
}
