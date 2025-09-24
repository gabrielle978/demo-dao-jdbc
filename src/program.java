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
        Department department = new Department(2,null);
        List<Seller> list = sellerDAO.findByDepartment(department);
        for(Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("\n=== Test 3: seller findAll ===");
        list = sellerDAO.findAll();
        for(Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== Test 4: seller insert ===");
        Seller newSeller = new Seller( "greg@gmail.com", department, 4000.0, new Date(), "Greg da Silva", null);
        sellerDAO.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("\n=== Test 5: seller update ===");
        seller = sellerDAO.findById(2);
        seller.setEmail("margarina_qualy@email.com");
        sellerDAO.update(seller);
        System.out.println("Update completed ");

    }
}