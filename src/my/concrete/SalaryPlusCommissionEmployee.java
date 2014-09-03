
package my.concrete;

/**
 *
 * @author Ching Vang
 */
public class SalaryPlusCommissionEmployee extends SalariedEmployee{
    private String name;
    private String aliasid;
    private String jobTitle;
    private double commission;

    public SalaryPlusCommissionEmployee(String name, String aliasid) {
        super(name, aliasid);
        this.name = name;
        this.aliasid = aliasid;
    }
  
    
    @Override
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAliasid() {
        return aliasid;
    }

    @Override
    public void setAliasid(String aliasid) {
        this.aliasid = aliasid;
    }

    @Override
    public String getJobtitle() {
        return jobTitle;
    }

    @Override
    public void setJobtitle(String jobtitle) {
        this.jobTitle = jobtitle;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
    
    
    
}
