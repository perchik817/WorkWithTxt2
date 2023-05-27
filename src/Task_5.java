import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Task_5 {
    public static void getEmployeeInfo(){
        String[] names = readLinesFromFile("C://Users//Sancho//OneDrive//Документы//first.txt");
        String[] positions = readLinesFromFile("C://Users//Sancho//OneDrive//Документы//second.txt");

        if (names.length != positions.length) {
            System.out.println("Ошибка: количество имен не совпадает с количеством должностей.");
            return;
        }

        for (int i = 0; i < names.length; i++) {
            System.out.printf("Сотрудник %s, должность - %s%n", names[i], positions[i]);
        }
        System.out.println();
    }

    private static String[] readLinesFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            return reader.lines().toArray(String[]::new);
        } catch (IOException e) {
            System.out.printf("Ошибка при чтении файла %s: %s%n", filename, e.getMessage());
            return new String[0];
        }
    }
}
