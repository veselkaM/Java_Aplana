package homework;

import java.util.Scanner;

public class FinalTask02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести число в бинарном формате: ");
        String bin = scanner.nextLine();
        System.out.println(toDecimal(bin));
    }

    public static int toDecimal(String str) {
        char[] chars = str.toCharArray();
        int result = 0;
        int mult = 1;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (chars[i] == '1') {
                result += mult;
            }
            mult *= 2;
        }
        return result;
    }

}




