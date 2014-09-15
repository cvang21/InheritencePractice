/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.concrete;

/**
 *
 * @author Owner
 */
public class DemoConcrete {
    String message; 
    public static void main(String[] args) {
        DemoConcrete m1 = new DemoConcrete();
        HourlyEmployee employee = new HourlyEmployee("Smith", "Bobbie","E1211");
        employee.setJobtitle("Secretary");
        employee.setWage(24.50);
        m1.message = ("Alias: " + employee.getAliasid()+ "\nName:" + employee.getLastName()
                + ", " + employee.getFirstName() + 
                "\nHourly Rate: " + employee.getWage());
        System.out.println(m1.message);
    }
}
