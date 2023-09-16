/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package departmentdb;

import model.Department;
import model.DepartmentTable;
import model.Employee;
import model.EmployeeTable;

/**
 *
 * @author cld
 */
public class Departmentdb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Department dp1 = new  Department();
        dp1.setName("IT");
        DepartmentTable.insertDepartment(dp1);
        Department dp2 = new  Department();
        dp2.setName("HR");
        DepartmentTable.insertDepartment(dp2);
        Employee em1 = new Employee("John","Network Admin",56789,dp1);
        Employee em2 = new Employee("Marry","HR Manager",46789,dp2);
        Employee em3 = new Employee("Henry","Programmer",67890,dp1);
        Employee em4 = new Employee("Clark","HR Recuiter",36789,dp2);
        EmployeeTable.insertEmployee(em1);
        EmployeeTable.insertEmployee(em2);
        EmployeeTable.insertEmployee(em3);
        EmployeeTable.insertEmployee(em4);        
    } 
}
