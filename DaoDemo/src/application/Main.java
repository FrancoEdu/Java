package application;

import model.entities.Department;
import model.entities.Seller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Department obj = new Department(1,"Computers");
        Seller seller = new Seller(21,"Edu","eduardo.franco@cnpem.br",new Date(), 3000.0, obj);
        System.out.println(obj + "\n" + seller);
    }
}