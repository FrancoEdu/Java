package model.Dao;

import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public interface SellerDao {
    void insert(SellerDao obj);
    void update(SellerDao obj);
    void deleteById(SellerDao id);
    Seller findById(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);
}
