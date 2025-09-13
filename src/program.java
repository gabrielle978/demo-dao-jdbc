import DAO.DaoFactory;
import DAO.SellerDAO;
import entities.Department;
import entities.Seller;

import java.util.Date;

public class program {
    public static void main(String[] args) {
        //Department obj = new Department(1, "Books");
        SellerDAO sellerDAO = DaoFactory.createSellerDao();

        Seller seller = sellerDAO.findById(3);

        System.out.println(seller);
    }
}
