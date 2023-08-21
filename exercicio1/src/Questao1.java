import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Questao1{
    public static void main(String[] args) {
        String filePath = args[0];

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int lineCount = 0;
            String line;

            while ((line = reader.readLine()) != null && lineCount < 10) {
                System.out.println(line);
                lineCount++;
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}