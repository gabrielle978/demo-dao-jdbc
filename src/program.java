import DAO.DaoFactory;
import DAO.SellerDAO;
import entities.Department;
import entities.Seller;

import java.util.Date;
import java.util.List;

public class program {
    public static void main(String[] args) {
        SellerDAO sellerDAO = DaoFactory.createSellerDao();


        System.out.println("=== Test 1: seller findById ===");
        Seller seller = sellerDAO.findById(3);
        System.out.println(seller);

        System.out.println("\n=== Test 2: seller findByDepartment ===");
        List<Seller> list = sellerDAO.findByDepartment(new Department(2,null));
        for(Seller obj : list){
            System.out.println(obj);
        }
    }
}
