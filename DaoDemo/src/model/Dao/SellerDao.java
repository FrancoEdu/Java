package model.Dao;

import model.entities.Seller;

public interface SellerDao {
    void insert(SellerDao obj);
    void update(SellerDao obj);
    void deleteById(SellerDao id);
    Seller findById(Integer id);
}
