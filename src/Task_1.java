import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task_1 {
    public static void getThreeLines() {
        String fileName = "C://Users//Sancho//OneDrive//Документы//books.txt";
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            int lineNumber = 0;
            while ((line = bufferedReader.readLine()) != null && lineNumber < 3) {
                System.out.println(line);
                lineNumber++;
            }
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        }
        System.out.println();
    }
}
