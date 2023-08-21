import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Questao3 {
    public static void main(String[] args) {

        String filePath1 = args[0];
        String filePath2 = args[1];

        System.out.println("Conteúdo do Arquivo 1:");
        printFileContents(filePath1);

        System.out.println("\nConteúdo do Arquivo 2:");
        printFileContents(filePath2);
    }

    private static void printFileContents(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo " + filePath + ": " + e.getMessage());
        }
    }
}

