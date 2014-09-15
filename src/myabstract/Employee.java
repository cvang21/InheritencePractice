
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

    public Employee(String firstName, String lastName, String aliasID, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.aliasID = aliasID;
        this.jobTitle = jobTitle;
    }
   

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAliasID() {
        return aliasID;
    }

    public void setAliasID(String aliasID) {
        this.aliasID = aliasID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    
    
}
