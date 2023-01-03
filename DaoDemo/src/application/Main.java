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

        System.out.println("================= 1st TEST =================");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("=================2nd TEST =================");
        Department department = new Department(1, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj :list){
            System.out.println(obj);
        }
    }
}