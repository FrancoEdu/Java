package StaticMembers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price?");
        double price = sc.nextDouble();
        System.out.println("How many dollars will be bought?");
        double dollar = sc.nextDouble();

        System.out.println("Amount to be paid in reais is R$ "+ CurrencyConverter.Converter(price,dollar));
    }
}
