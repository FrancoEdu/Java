package HashcodeAndEquals.application;

import HashcodeAndEquals.entities.Client;

public class Main {
    public static void main(String[] args){
        String a = "Maria";
        String b =  "Alex";
        String c = "Edu";
        String d = "MariA";

        System.out.println(a.equals(b));
        System.out.println(a.equals(d));
        System.out.println("--------- HASHCODE ---------");
        System.out.println(c.hashCode());
        System.out.println(a.hashCode() + " - Maria");
        System.out.println(d.hashCode() + " - MariA");
        System.out.println("\n--------- USING CLASS CLIENT ---------");

        Client client1 = new Client("Maria", "maria@gmail.com");
        Client client2 = new Client("Maria", "bob@gmail.com");
        System.out.println(client1.hashCode());
        System.out.println(client2.hashCode());
        System.out.println(client1.equals(client2));
    }
}
