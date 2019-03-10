package homework;

public class Task15 {

    public static void main(String[] args) {
        int arr[] = new int[22];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }

        System.out.print("\n");
        bubbleSort(arr);
        for(int i = 0; i <  arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static void bubbleSort(int[] arr){
    /*Внешний цикл каждый раз сокращает фрагмент массива,
      так как внутренний цикл каждый раз ставит в конец
      фрагмента максимальный элемент*/
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами */
            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
}
}

