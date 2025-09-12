package DAO;

import entities.Seller;

import java.util.List;

public class DaoFactory {
    public static SellerDAO createSellerDao(){
        return new SellerDAO() {
            @Override
            public void insert(Seller obj) {

            }

            @Override
            public void update(Seller obj) {

            }

            @Override
            public void deleteById(Integer id) {

            }

            @Override
            public Seller findById(Integer id) {
                return null;
            }

            @Override
            public List<Seller> findAll() {
                return List.of();
            }
        };
    }
}
