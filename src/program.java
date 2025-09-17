import DAO.DaoFactory;
import DAO.SellerDAO;
import entities.Department;
import entities.Seller;

import java.util.Date;

public class program {
    public static void main(String[] args) {
        SellerDAO sellerDAO = DaoFactory.createSellerDao();


        System.out.println("=== Test 1: seller findById ===");
        Seller seller = sellerDAO.findById(3);
        System.out.println(seller);
    }
}
