
package my.concrete;

/**
 *
 * @author Ching Vang
 */
public class SalaryPlusCommissionEmployee extends SalariedEmployee{

    private double commission;

    public SalaryPlusCommissionEmployee(String lname, String fname, String aliasid) {
        super(lname, fname, aliasid);
   
    }

    public double getCommission() {
        return this.commission;
    }

    public void setCommission(double commission) {
        if (commission >0){
        this.commission = commission;
            } else
                {
                    System.out.println("Not a valid Commission!");
                }
        }
}