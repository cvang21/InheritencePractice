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
    public static void main(String[] args) {
        SalariedEmployee s1 = new SalariedEmployee();
        my.concrete.HourlyEmployee e1 = new my.concrete.HourlyEmployee("Bob","E1211");
        e1.setJobtitle("Secretary");
        e1.setHourlyWage("24.50");
        System.out.println(e1.getName()+" gets paid " + e1.getHourlyWage() + " per Hour");
    }
}
