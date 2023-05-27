import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task_2 {
    public static void returnFileData(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя файла: ");
        String fileName = "C://Users//Sancho//OneDrive//Документы//" + scanner.nextLine() + ".txt";
        scanner.close();

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            int lines = 0;
            int words = 0;
            int characters = 0;
            while ((line = bufferedReader.readLine()) != null) {
                lines++;
                characters += line.length();
                String[] wordsArray = line.split("\\s+");
                words += wordsArray.length;
            }
            bufferedReader.close();
            characters -= (lines - 1); // убираем пробелы и точки в конце строк
            System.out.println("Количество строк: " + lines);
            System.out.println("Количество слов: " + words);
            System.out.println("Количество символов без пробелов и точек: " + characters);
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден.");
        } catch (IOException ex) {
            System.out.println("Ошибка чтения файла.");
        }
        System.out.println();
    }
}
