package Challenge.application;

import Challenge.model.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        List<Product> products = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter path name:");
        String path = scanner.nextLine();

        File sourceFile = new File(path);
        String sourceGetDirectory = sourceFile.getParent();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String line = bufferedReader.readLine();

            while(line != null){
                String[] fields = line.split(",");
                String name = fields[0];
                Double price = Double.parseDouble(fields[1]);
                Integer quantity = Integer.parseInt(fields[2]);

                products.add(new Product(name,price,quantity));

                line = bufferedReader.readLine();
            }
        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }

        boolean createDirectory = new File(sourceGetDirectory + "\\summary").mkdir();
        String targetFileStr = sourceGetDirectory + "\\summary\\summary.txt";

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(targetFileStr))){
            for (Product prod:products){
                bufferedWriter.write(prod.getName() + "," + prod.totalOfpriceXquantity());
                bufferedWriter.newLine();
            }
            System.out.println("Arquivo gerado!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
