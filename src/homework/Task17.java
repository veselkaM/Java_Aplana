package homework;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task17 {
    public static void main(String[] args) {
        String s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Признак конца ввoда - строка 'stop' ");

        try (FileWriter fw = new FileWriter("test.txt")) {
            do {
                System.out.print(": ");
                s = br.readLine();

                if (s.equals("stop")) break;

                s = s + "\r\n";
                fw.write(s);
            } while (!s.equals("stop"));
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
