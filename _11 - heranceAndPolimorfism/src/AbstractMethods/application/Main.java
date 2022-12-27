package AbstractMethods.application;

import AbstractMethods.entities.Circus;
import AbstractMethods.entities.Color;
import AbstractMethods.entities.Rectangle;
import AbstractMethods.entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();

        System.out.println("Enter the number of shapes: ");
        int quantity = scanner.nextInt();

        for (int x = 1; x <= quantity; x++){
            System.out.println("Shape #" + x + " data");
            System.out.println("Rectangle or Circle (r/c)");
            char option = scanner.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(scanner.next());

            if (option == 'r'){
                System.out.println("Width: ");
                double width = scanner.nextDouble();
                System.out.println("Height: ");
                double heigth = scanner.nextDouble();
                list.add(new Rectangle(color, width, heigth));
            }
            else{
                System.out.println("Radius: ");
                double radius = scanner.nextDouble();
                list.add(new Circus(color,radius));
            }
        }

        System.out.println("");
        System.out.println("SHAPE AREA: ");
        for (Shape sha:list){
            System.out.println("");
            System.out.printf("%.2f",sha.area());
        }
    }
}
