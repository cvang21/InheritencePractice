
package myabstract;

/**
 *
 * @author Ching Vang
 */
public abstract class Employee {
    
    private String firstName;
    private String lastName;
    private String aliasID;
    private String jobTitle;

   
    public String getfirstName() {
        return firstName;

    }

    public void setName(String fName) {
        this.firstName = fName;
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
