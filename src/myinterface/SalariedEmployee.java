
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
    private String yearlySalary;
   
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

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getAliasID() {
        return aliasID;
    }

    public void setAliasID(String aliasID) {
        this.aliasID = aliasID;
    }

    public String getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(String yearlySalary) {
        this.yearlySalary = yearlySalary;
    }
    
}
