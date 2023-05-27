import java.io.*;
import java.util.Scanner;

public class Task_9 {
    public static void transliterate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название файла: ");
        String fileName = "C:/Users/User/Documents/input.txt";
        //System.out.print("Введите название файла: ");

        File inputFile = new File(fileName);
        if (!inputFile.exists()) {
            System.out.println("Файл не найден!");
            return;
        }

        String outputFileName = "result.txt";
        File outputFile = new File(outputFileName);

        try (Scanner fileScanner = new Scanner(inputFile);
             FileWriter fileWriter = new FileWriter(outputFile)) {

            String[][] dict = {
                    {"а", "a"},
                    {"б", "b"},
                    {"в", "v"},
                    {"г", "g"},
                    {"д", "d"},
                    {"е", "e"},
                    {"ё", "yo"},
                    {"ж", "zh"},
                    {"з", "z"},
                    {"и", "i"},
                    {"й", "y"},
                    {"к", "k"},
                    {"л", "l"},
                    {"м", "m"},
                    {"н", "n"},
                    {"о", "o"},
                    {"п", "p"},
                    {"р", "r"},
                    {"с", "s"},
                    {"т", "t"},
                    {"у", "u"},
                    {"ф", "f"},
                    {"х", "kh"},
                    {"ц", "ts"},
                    {"ч", "ch"},
                    {"ш", "sh"},
                    {"щ", "shch"},
                    {"ъ", ""},
                    {"ы", "y"},
                    {"ь", ""},
                    {"э", "e"},
                    {"ю", "yu"},
                    {"я", "ya"}
            };

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                for (String[] pair : dict) {
                    line = line.replaceAll(pair[0], pair[1]);
                    line = line.replaceAll(pair[0].toUpperCase(), pair[1].toUpperCase());
                }
                fileWriter.write(line + "\n");
            }
            System.out.println("Транслитерация выполнена! Результат записан в файл " + outputFileName);

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}