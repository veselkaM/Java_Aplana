package homework;

import java.util.Scanner;

public class FinalTask01 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Ввести число в бинарном формате: ");
            String bin = scanner.nextLine();
            BinToDec(bin);
            System.out.println(BinToDec(bin));

        }

        public static int pow(int x, int y) {
            int result = 1;
            for (int i = 0; i < y; i++) {
                result = result * x;
            }
            return result;
        }

        public static int BinToDec(String bin){
            int res = 0, a = 0, mult = 0;
            char[] symbols = bin.toCharArray();
            for(int len = symbols.length-1; len >= 0; len--){
                int temp = 0;
                a = Character.getNumericValue(symbols[len]);
                temp = a * pow(2, mult);
                mult++;
                res = res +temp;
            }
            return res;
        }
}
