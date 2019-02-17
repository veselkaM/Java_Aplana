package homework;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int i = 1;

        System.out.println("1 x " + number + " = " + number*i);
        System.out.println("2 x " + number + " = " + number * ++i);
        System.out.println("3 x " + number + " = " + number * ++i);
        System.out.println("4 x " + number + " = " + number * ++i);
        System.out.println("5 x " + number + " = " + number * ++i);
        System.out.println("6 x " + number + " = " + number * ++i);
        System.out.println("7 x " + number + " = " + number * ++i);
        System.out.println("8 x " + number + " = " + number * ++i);
        System.out.println("9 x " + number + " = " + number * ++i);
        System.out.println("10 x " + number + " = "+ number * ++i);



  /*      проще было бы циклом:
        for (int x = 1; x <= 10; x++) {
            System.out.println(x + " x " + number + " = " + number*x);
        }
       */

    }
}
