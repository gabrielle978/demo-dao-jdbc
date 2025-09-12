import DAO.DaoFactory;
import DAO.SellerDAO;
import entities.Department;
import entities.Seller;

import java.util.Date;

public class program {
    public static void main(String[] args) {
        Department obj = new Department(1, "Books");
        Seller seller = new Seller("email@gmail.com", obj, 3000.0, new Date(), "nameHere", 21);

        SellerDAO sellerDAO = DaoFactory.createSellerDao();

        System.out.println(seller);
    }
}
