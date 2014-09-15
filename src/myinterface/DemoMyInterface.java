
package myinterface;

/**
 *
 * @author Ching Vang
 */
public class DemoMyInterface {
    
    public static void main(String[] args) {
        myinterface.SalariedEmployee salariedEmployee = new myinterface.SalariedEmployee("Bob Smith", "Manager", "AAAA", "09/11/13", 30000.00);
        myinterface.HourlyEmployee hourlyEmployee = new myinterface.HourlyEmployee("Bob Smith", "Manager", "AAAA", "09/11/13");

    }
}
