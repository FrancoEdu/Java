package FileWriterAndBufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
        String path = "C:\\temp\\out.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) { //leitura: para cada string line contida no vetor Lines
                bw.write(line); //printa no arquivo
                bw.newLine(); //quebra de linha
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
