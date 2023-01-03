package model.Dao;

import db.DB;
import model.Dao.impl.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection()); //RESTRINGE A IMPLEMENTAÇÃO MOSTRANDO SOMENTE A INTERFACE
    }
}
