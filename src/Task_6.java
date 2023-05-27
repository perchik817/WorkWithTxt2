import java.io.FileWriter;
import java.io.IOException;
public class Task_6 {
    public static void generateAlphabet() {
        char[] alphabet = new char[33];
        for (int i = 0; i < 32; i++) {
            alphabet[i] = (char) ('А' + i);
        }
        alphabet[32] = 'Ё';

        // Записываем алфавит в файл alphabet.txt
        try (FileWriter writer = new FileWriter("C://Users//Sancho//OneDrive//Документы//alphabet.txt")) {
            for (char c : alphabet) {
                // Добавляем строчный вариант буквы
                writer.write(Character.toLowerCase(c) + "" + c + System.lineSeparator());
            }
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());

        }
    }
}
