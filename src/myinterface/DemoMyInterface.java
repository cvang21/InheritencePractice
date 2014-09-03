
package myinterface;

/**
 *
 * @author Ching Vang
 */
public class DemoMyInterface {
    
    public static void main(String[] args) {
        myabstract.SalariedEmployee s1 = new myabstract.SalariedEmployee();
        my.concrete.HourlyEmployee e1 = new my.concrete.HourlyEmployee("Bob","E1211");
        e1.setJobtitle("Secretary");
        e1.setHourlyWage("24.50");
        System.out.println(e1.getName()+" gets paid " + e1.getHourlyWage() + " per Hour");
    }
}
