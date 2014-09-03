
package myabstract;

/**
 *
 * @author Ching Vang
 */
public abstract class Employee {
    
    private String name;
    private String aliasID;
    private String jobTitle;

   
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
    
}
