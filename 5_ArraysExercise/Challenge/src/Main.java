import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rooms will be rented? ");
        int numberOfRents = sc.nextInt();

        Rent[] rooms = new Rent[10];

        for(int x = 1; x <= numberOfRents; x++){
            System.out.println("Rent #" + x);
            System.out.print("Name:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email:");
            String email = sc.next();
            System.out.print("Room:");
            int roomNumber = sc.nextInt();
            rooms[roomNumber] = new Rent(name,email);
        }

        System.out.println("Busy rooms: ");
        for (int x = 0; x<rooms.length; x++){
            if (rooms[x] != null){
                System.out.println(x + ": " + rooms[x]);
            }
        }

        sc.close();
    }
}