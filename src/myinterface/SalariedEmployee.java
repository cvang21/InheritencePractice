
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
}
