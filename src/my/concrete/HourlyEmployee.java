

package my.concrete;

/**
 *
 * @author Ching Vang
 */
public class HourlyEmployee extends Employee {
    private String name;
    private String aliasID;
    private String jobTitle;
    private double hourlyWage;

    public HourlyEmployee(String name, String aliasid){
        super(name, aliasid);
        this.name = name;
        this.aliasID = aliasid;
    }
   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getAliasid() {
        return aliasID;
    }


    public void setAliasid(String aliasid) {
        this.aliasID = aliasid;
    }


    public String getJobtitle() {
        return jobTitle;
    }


    public void setJobtitle(String jobtitle) {
        this.jobTitle = jobtitle;
    }

    public double getHourlyWage() {
        return this.hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
        
    
}
