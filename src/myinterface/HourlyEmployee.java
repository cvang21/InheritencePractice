package myinterface;

/**
 *
 * @author Ching Vang
 */
public class HourlyEmployee implements Employee {
    private String name;
    private String jobTitle;
    private String aliasID;
    private String startDate;

    public HourlyEmployee(String name, String jobTitle, String aliasID, String startDate) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.aliasID = aliasID;
        this.startDate = startDate;
    }
     
    @Override
    public void setStartDate(String start){
    this.startDate = start;}
    
    @Override
    public void setName(String name){
    this.name = name;}

    @Override
    public String getAliasid(){
    return this.aliasID;}
    
    @Override
    public void setAliasid(String aliasid){
    this.aliasID = aliasid;} 

    @Override
    public String getJobtitle(){
    return this.jobTitle; }

    @Override
    public void setJobtitle(String jobtitle){
    this.jobTitle = jobtitle;
    }
}
