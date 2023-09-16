/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package departmentdb;

import java.util.List;
import model.Department;
import model.DepartmentTable;
import model.Employee;
import model.EmployeeTable;

/**
 *
 * @author cld
 */
public class Department_remove {
    public static void main(String[] agrs){
        List<Department> depart = DepartmentTable.findAllDepartment();
//        List<Employee> emp = EmployeeTable.findAllEmployee();
        for(Department dp: depart){
            DepartmentTable.removeDepartment(dp);
        }
        
    }
    
}
