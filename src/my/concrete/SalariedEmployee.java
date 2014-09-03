package my.concrete;

/**
 *
 * @author Ching Vang
 */
public class SalariedEmployee extends Employee {
    private String name;
    private String aliasID;
    private String jobTitle;
    private String yearlySalary;

    public SalariedEmployee(String name, String aliasid) {
        super(name, aliasid);
        this.name = name;
        this.aliasID = aliasid;
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
        return aliasID;
    }

    @Override
    public void setAliasid(String aliasid) {
        this.aliasID = aliasid;
    }

    @Override
    public String getJobtitle() {
        return jobTitle;
    }

    @Override
    public void setJobtitle(String jobtitle) {
        this.jobTitle = jobtitle;
    }

    public String getSalary() {
        return yearlySalary;
    }

    public void setSalary(String salary) {
        this.yearlySalary = salary;
    }
    
        
}
