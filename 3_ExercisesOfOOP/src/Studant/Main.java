package Studant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Studant studant = new Studant();

        System.out.println("Type the first grade: ");
        studant.firstGrade = scanner.nextDouble();
        System.out.println("Type the second grade: ");
        studant.secondGrade = scanner.nextDouble();
        System.out.println("Type the third grade: ");
        studant.thirdGrade = scanner.nextDouble();

        System.out.println(studant.toString());
    }
}
