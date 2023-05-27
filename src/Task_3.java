import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Task_3 {
    public static void getMaxWord() {
        String fileName = "C://Users//Sancho//OneDrive//Документы//books.txt";
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String longestWord = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] wordsArray = line.split("\\s+");
                for (String word : wordsArray) {
                    if (word.length() >= longestWord.length()) {
                        longestWord = word;
                    }
                }
            }
            bufferedReader.close();
            System.out.println("Самое длинное слово: " + longestWord);
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден.");
        } catch (IOException ex) {
            System.out.println("Ошибка чтения файла.");
        }
        System.out.println();
    }
}
