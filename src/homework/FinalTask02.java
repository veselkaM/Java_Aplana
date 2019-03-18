package homework;

import java.util.Scanner;

public class FinalTask02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");

        int size = scanner.nextInt();
        double array[] = new double[size];

        System.out.println("Введите числа в массив:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }

        System.out.print("\n");
        bubbleSort(array);
        for(int i = 0; i <  array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }

    public static void bubbleSort(double[] arr){
    /*Внешний цикл каждый раз сокращает фрагмент массива,
      так как внутренний цикл каждый раз ставит в конец
      фрагмента максимальный элемент*/
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами */
                if( arr[j] > arr[j+1] ){
                    double tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
}
}




