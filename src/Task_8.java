import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Task_8 {
    public static void getMarks() {
        File file = new File("C:/Users/User/Desktop/Kyz Saikal/My works/AISD_/aisdThirdColl/TextFileEighthTask.txt");

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] tokens = line.split(" ");
                String name = tokens[0] + " " + tokens[1];
                int sum = 0;
                int count = 0;
                for (int i = 2; i < tokens.length; i++) {
                    if (!tokens[i].isEmpty()) {
                        sum += Integer.parseInt(tokens[i]);
                        count++;
                    }
                }
                double average = (double) sum / count;
                if (average >= 4.5) {
                    System.out.println(name + ", средний балл: " + String.format("%.2f", average));
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
}
