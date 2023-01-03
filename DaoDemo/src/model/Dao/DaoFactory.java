package model.Dao;

import model.Dao.impl.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(); //RESTRINGE A IMPLEMENTAÇÃO MOSTRANDO SOMENTE A INTERFACE
    }
}
