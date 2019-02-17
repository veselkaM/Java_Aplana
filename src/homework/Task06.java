package homework;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x, y, z, m;
        int result;

        x = getNumber(scanner, "Введите число x: ");
        y = getNumber(scanner, "Введите число y: ");
        z = getNumber(scanner, "Введите число z: ");
        m = (x+y+z)/3;
        result = (int) (m/2);

        System.out.printf("среднее арифметическое чисел x, y, z = " + "%.4f \n",m );
        System.out.println(result);

        if (result > 3) {
            System.out.println("Программа выполнена корректно");
        }


    }

    private static float getNumber(Scanner scanner, String s) {
        System.out.print(s);
        float i = scanner.nextFloat();
        return i;
    }
}
