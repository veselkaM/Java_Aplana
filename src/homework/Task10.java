package homework;

//Произведите ввод данных с клавиатуры в матрицу, а после этого произведите вывод первой строки матрицы на экран, где каждый элемент умножается на 3.

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество столбцов в матрице : ");
        int x = scanner.nextInt();

        System.out.println("Введите количество строк в матрице : ");
        int y = scanner.nextInt();


        int[][] matrixA;
        matrixA = new int[y][x];

        System.out.println("Введите числа в массив:");
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(matrixA[i][j]*3 + "\t");
            }
            System.out.println();
        }
    }
}
