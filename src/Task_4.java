import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Task_4 {
    public static void countFruit(){
        String filename = "C://Users//Sancho//OneDrive//Документы//fruit.txt";
        Map<String, Integer> fruitCount = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fruits = line.trim().toLowerCase().split("\\s+");
                for (String fruit : fruits) {
                    String cleanFruit = fruit.replaceAll("[^a-zA-Zа-яА-Я]", "");
                    if (!cleanFruit.isEmpty()) {
                        Integer count = fruitCount.getOrDefault(cleanFruit, 0);
                        fruitCount.put(cleanFruit, count + 1);
                    }
                }
            }
        } catch (FileNotFoundException ex) {
                System.out.println("Файл не найден.");
        } catch (IOException ex) {
                System.out.println("Ошибка чтения файла.");
        }

        for (String fruit : fruitCount.keySet()) {
            System.out.printf("\"%s\" - %d раз(а)\n", fruit, fruitCount.get(fruit));
        }
        System.out.println();
    }
}
