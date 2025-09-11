package DAO;

import entities.Department;
import entities.Seller;

import java.util.List;

public interface SellerDAO {
    void insert(Seller obj);
    void update (Seller obj);
    void deleteById (Integer id);
    Seller findById (Integer id);
    List<Seller> findAll();
}
