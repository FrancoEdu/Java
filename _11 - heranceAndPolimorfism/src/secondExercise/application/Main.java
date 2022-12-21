package secondExercise.application;

import secondExercise.entities.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int quantity = scanner.nextInt();

        for (int x = 1; x <= quantity; x++){
            System.out.println("Product #" + x + " data");
            System.out.println("Common, used or imported (c/u/i) ?");
            char option = scanner.next().charAt(0);
            scanner.nextLine();
            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("Price: ");
            Double price = scanner.nextDouble();

            if (option == 'c'){
                list.add(new Product(name,price));
            } else if (option == 'u') {
                System.out.println("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(scanner.next());
                list.add(new UsedProduct(name, price, date));
            }
            else {
                System.out.println("Customs Fee: ");
                Double customsFee = scanner.nextDouble();
                list.add(new ImportedProduct(name,price,customsFee));
            }
        }

        System.out.println();
        System.out.println("----------------------------- PRICE TAGS -----------------------------");

        for (Product prod : list){
            System.out.println(prod.priceTag());
        }
    }
}
