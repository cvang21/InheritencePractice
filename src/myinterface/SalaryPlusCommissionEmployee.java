
package myinterface;

/**
 *
 * @author Ching Vang
 */
public class SalaryPlusCommissionEmployee extends SalariedEmployee {
    private String name;
    private String jobTitle;
    private String aliasID;
    private String startDate;
    private double yearlySalary;
    private double commission;

    public SalaryPlusCommissionEmployee(double commission, String name, String jobTitle, String aliasID, String startDate, double yearlySalary) {
        super(name, jobTitle, aliasID, startDate, yearlySalary);
        this.commission = commission;
    }
    
    
    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
    
}