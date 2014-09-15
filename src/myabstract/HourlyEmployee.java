
package myabstract;

/**
 *
 * @author Ching Vang
 */
public class HourlyEmployee extends Employee {

    private double hourlyRate;

    public HourlyEmployee(double hourlyRate, String lastname, String fname, String aliasID, String jobTitle) {
        super(lastname, fname, aliasID, jobTitle);
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    
}
