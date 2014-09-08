
package my.concrete;

/**
 *
 * @author Ching Vang
 */
public class SalaryPlusCommissionEmployee extends SalariedEmployee{

    private double commission;

    public SalaryPlusCommissionEmployee(String name, String aliasid) {
        super(name, aliasid);
        this.commission = 0;
    }
 

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
    
    
    
}
