/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package departmentdb;

import java.util.List;
import java.util.Objects;
import model.Department;
import model.DepartmentTable;
import model.Employee;
import model.EmployeeTable;

/**
 *
 * @author cld
 */
public class Department_show {
    public static void main(String[] agrs){
        List<Department> depart = DepartmentTable.findAllDepartment();
        List<Employee> emp = EmployeeTable.findAllEmployee();
        printAllbyID(emp);
        printAllbyDepartment(depart,emp);
    }
    public static void printAllbyID(List<Employee> employeeList) {
        System.out.println("All employee (By ID)");
        
        System.out.println("-------------------------------");
        for(Employee emp : employeeList) {
           System.out.println("ID : " + emp.getEmployeeid() + " ");
           System.out.println("Name : " + emp.getName() + " ");   
           System.out.println("Job : " + emp.getJob() + " ");
           System.out.println("Salary : " + emp.getSalary() + " ");
           System.out.println("Department : " + emp.getDepartmentid().getName() + " ");
           System.out.println("-------------------------------");}
    }
    public static void printAllbyDepartment(List<Department> departmentList, List<Employee> employeeList) {
        System.out.println("All employee (By Department)");
        System.out.println("-------------------------------");
        for(Department dp : departmentList){
            System.out.println("Department ID: "+dp.getDepartmentid()+" Department Name: "+dp.getName());
            System.out.println("-------------------------------");
            for(Employee emp : employeeList) {
                if(Objects.equals(emp.getDepartmentid(), dp)){
                    System.out.println("ID : " + emp.getEmployeeid() + " ");
                    System.out.println("Name : " + emp.getName() + " ");   
                    System.out.println("Job : " + emp.getJob() + " ");
                    System.out.println("Salary : " + emp.getSalary() + " ");
                    System.out.println("-------------------------------");
                }
            }
        }
    }
}
