import DAO.DaoFactory;
import DAO.DepartmentDAO;
import entities.Department;

import java.util.List;
import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        DepartmentDAO departmentDAO = DaoFactory.createDepartmentDao();
        Scanner sc = new Scanner(System.in);


        System.out.println("=== Test 1: findById department ===");
        System.out.println("Enter id department number: ");
        int id_FindByID = sc.nextInt();
        Department department = departmentDAO.findById(id_FindByID);
        System.out.println(department);

        System.out.println("=== Test 2: findAll department ===");
        List<Department> departments = departmentDAO.findAll();
        for (Department obj: departments){
            System.out.println(obj);
        }

        System.out.println("=== Test 3: department insert ===");
        System.out.println("Enter a name for a new department: ");
        String department_Name = sc.next();
        Department newDepartment = new Department(null,department_Name);
        departmentDAO.insert(newDepartment);
        System.out.println("Department inserted. Id: "+ newDepartment.getId());

        System.out.println("=== Test 4: department update ===");
        System.out.println("Enter department id for update: ");
        int id_DepartmentUpdate = sc.nextInt();
        department = departmentDAO.findById(id_DepartmentUpdate);
        System.out.println("Enter a new name for department "+ department.getId() + ": ");
        String new_NameDep = sc.next();
        department.setName(new_NameDep);
        departmentDAO.update(department);
        System.out.println("Department updated!");

        System.out.println("=== Test 5: department delete ===");
        System.out.println("Enter department id for delete: ");
        int id_DepartmentDelete = sc.nextInt();
        departmentDAO.deleteById(id_DepartmentDelete);
        System.out.println("Delete completed");
    }
}
