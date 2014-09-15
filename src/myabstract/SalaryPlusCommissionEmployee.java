
package myabstract;

/**
 *
 * @author Ching Vang
 */
public class SalaryPlusCommissionEmployee extends SalariedEmployee {
    private double commission;
    
    public SalaryPlusCommissionEmployee(double commission, double salary, String lastname, String fname, String aliasID, String jobTitle) {
        super(salary, lastname, fname, aliasID, jobTitle);
        this.commission = commission;
    }
    
    public double getcommission() {
        return this.commission;
    }

    public void setCommision(double commission) {
        this.commission = commission;
    }
    
}
