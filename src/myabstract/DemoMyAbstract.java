/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myabstract;

/**
 *
 * @author Owner
 */
public class DemoMyAbstract {

    String message1;
    String message2;
    String message3;
    
    public static void main(String[] args) {
        DemoMyAbstract d = new DemoMyAbstract();
        
        myabstract.Employee employee = new myabstract.SalariedEmployee(60000,"Jones", "Tom", "AAAA", "Sales manager");
        myabstract.Employee hourlyEmployee = new myabstract.HourlyEmployee(35.50, "Sommers", "Bob","E1211", "Engineer");
        myabstract.Employee salaryPlusCommissionEmployee = new myabstract.SalaryPlusCommissionEmployee(25000, 100000, "Edison", "Thomas", "BBBB", "Sales Rep");
        
        d.message1 = ("Alias: " + employee.getAliasID()
                     + "\nName: " + employee.getLastName() + ", " + employee.getFirstName()
                     + "\nJob Title: " + employee.getJobTitle()
                     + "\nHourly Wage: ");          

        System.out.println(d.message1);
        
    }
}
