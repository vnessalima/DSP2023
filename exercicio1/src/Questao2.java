import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Questao2 {
    public static void main(String[] args) {

        String filePath = args[0];
        String searchString = args[1];

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.contains(searchString)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}

