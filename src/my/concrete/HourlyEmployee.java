

package my.concrete;

/**
 *
 * @author Ching Vang
 */
public class HourlyEmployee extends Employee {

    private double hourlyWage;

    public HourlyEmployee(String name, String aliasid){
        super(name, aliasid);
        this.hourlyWage = 0.00;
    }
        public double getHourlyWage() {
        return this.hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
        
    
}
