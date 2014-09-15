
package myinterface;

/**
 *
 * @author Ching Vang
 */
public class SalariedEmployee implements Employee {
    private String name;
    private String jobTitle;
    private String aliasID;
    private String startDate;
    private double yearlySalary;

    public SalariedEmployee(String name, String jobTitle, String aliasID, String startDate, double yearlySalary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.aliasID = aliasID;
        this.startDate = startDate;
        this.yearlySalary = yearlySalary;
    }
    
    
    @Override
    public void setStartDate(String start) {
        this.startDate = start;
    }

    @Override
    public void setName(String name) {
       this.name = name;
    }

    @Override
    public String getAliasid() {
       return this.aliasID;
    }

    @Override
    public void setAliasid(String aliasid) {
        this.aliasID = aliasid;
    }

    @Override
    public String getJobtitle() {
        return this.jobTitle;
    }

    @Override
    public void setJobtitle(String jobtitle) {
        this.jobTitle = jobtitle;
    }

}
