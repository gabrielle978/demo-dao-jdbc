package DAO;

import Impl.SellerDaoJDBC;
import db.DB;
import entities.Seller;

import java.util.List;

public class DaoFactory {
    public static SellerDAO createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }
}
