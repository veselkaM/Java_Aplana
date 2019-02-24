package homework;

//Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран, где каждый элемент массива умножается на 2.

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");

        int size = scanner.nextInt();
        double array[] = new double[size];

        System.out.println("Введите числа в массив:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }

        System.out.println("Элементы массива умноженные на 2:");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] * 2);
        }
    }
}
