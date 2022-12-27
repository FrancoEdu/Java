package FileReaderAndBufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "in.txt"; //caminho do arquivo
        BufferedReader br = null;
        FileReader fr = null;

            try{
                fr = new FileReader(path);
                br = new BufferedReader(fr);
                String line = br.readLine(); //lê alinha do arquivo, se estiver na ultiam linha retorna null
                while (line != null) {
                    System.out.println(line);
                    line = br.readLine();
                }
            }catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }finally {
                try {
                    if (br != null)
                        br.close();
                    if (fr != null)
                        fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
    }
}
