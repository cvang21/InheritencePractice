
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
   
    @Override
    public void setStartDate(String start){
    this.startDate = start;}
    
    @Override
    public void setName(String name){
    this.name = name;} 

    @Override
    public String getAliasid(){
    return this.aliasID;
    }
    
    @Override
    public void setAliasid(String aliasid){} 

    @Override
    public String getJobtitle(){
    return this.jobTitle;}

    @Override
    public void setJobtitle(String jobtitle){
    this.jobTitle = jobtitle;}

    @Override
    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String getAliasID() {
        return aliasID;
    }

    @Override
    public void setAliasID(String aliasID) {
        this.aliasID = aliasID;
    }

    @Override
    public String getYearlySalary() {
        return yearlySalary;
    }

    @Override
    public void setYearlySalary(String yearlySalary) {
        this.yearlySalary = yearlySalary;
    }
    
}
