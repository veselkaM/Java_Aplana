package homework;

import java.io.*;

public class Task18 {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        String s;
        int linesCount = 0;

        //читаем все строки
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }

        //считаем количество строк
        try (LineNumberReader lnr = new LineNumberReader(new FileReader(file))) {
            while (null != lnr.readLine()) {
                linesCount++;
            }
            System.out.println("Количество строк в файле: " + linesCount);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }

        //перезаписываем всё в файле с тем же количеством строк
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите такое же количество строк: ");
        try (FileWriter fw = new FileWriter("test.txt")) {
            for (int i = 1; i <= linesCount; i++) {
                System.out.print(": ");
                s = br.readLine();
                s = s + "\r\n";
                fw.write(s);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}


