import java.io.*;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;

public class Task_10 {
    public static void getHour(){
        ArrayList<String> bestEmployees = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("C://Users//Sancho//OneDrive//Документы//crm_log.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                String name = parts[0];
                LocalTime start = LocalTime.parse(parts[1]);
                LocalTime end = LocalTime.parse(parts[2]);
                Duration duration = Duration.between(start, end);
                if (duration.toHours() >= 4) {
                    bestEmployees.add(name);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C://Users//Sancho//OneDrive//Документы//best_employees.txt"))) {
            for (String employee : bestEmployees) {
                writer.write(employee + "\n");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
