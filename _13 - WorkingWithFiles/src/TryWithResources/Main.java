package TryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "in.txt"; //caminho do arquivo

            try (BufferedReader br = new BufferedReader(new FileReader(path))){
                String line = br.readLine(); //lê alinha do arquivo, se estiver na ultiam linha retorna null
                while (line != null) {
                    System.out.println(line);
                    line = br.readLine();
                }
            }catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
    }
}
