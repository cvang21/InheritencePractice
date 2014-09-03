
package myabstract;

/**
 *
 * @author Ching Vang
 */
public class HourlyEmployee extends Employee {
    private String name;
    private String aliasid;
    private String jobtitle;
    private double hourlyRate;

    @Override
    public String getName() {
        return name;
    }
    
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
        return jobtitle;
    }

    @Override
    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    
}
