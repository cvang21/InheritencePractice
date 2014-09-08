
package myabstract;

/**
 *
 * @author Ching Vang
 */
public class SalaryPlusCommisionEmployee extends SalariedEmployee {
    
    private double commission;

    @Override
    public double getcommission() {
        return this.commission;
    }

    @Override
    public void setSalary(double commission) {
        this.commission = commission;
    }
    
}
