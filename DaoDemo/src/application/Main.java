package application;

import model.Dao.DaoFactory;
import model.Dao.SellerDao;
import model.Dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        /*
        System.out.println("================= 1st TEST =================");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("=================2nd TEST =================");
        Department department = new Department(1, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj :list){
            System.out.println(obj);
        }

        System.out.println("=================3rd TEST =================");
        list = sellerDao.findAll();
        for (Seller obj :list){
            System.out.println(obj);
        }

        System.out.println("=================4th TEST =================");
        Seller newSeller = new Seller(null,"Leticia Zancani","leticiazancani@gmail.com",new Date(),2300.0,department);
        sellerDao.insert(newSeller);

        System.out.println("=================5th TEST =================");
        seller = sellerDao.findById(1);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Updated !");

        System.out.println("=================6th TEST =================");
        sellerDao.deleteById(45);
        System.out.println("Updated !");
         */


    }
}