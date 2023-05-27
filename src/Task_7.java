import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Task_7 {
    public static void getIncome(){
        String incomeFile = "C://Users//Sancho//OneDrive//Документы//income.txt";
        String outcomeFile = "C://Users//Sancho//OneDrive//Документы//outcome.txt";
        double income = 0;
        double outcome = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(incomeFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                double amount = Double.parseDouble(line.substring(3));
                income += amount;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(outcomeFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                double amount = Double.parseDouble(line.substring(4));
                outcome += amount;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        double profit = income - outcome;
        System.out.printf("Прибыль за прошлый месяц: %.0f RUB", profit);
        System.out.println();
    }
}
