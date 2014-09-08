package my.concrete;

/**
 *
 * @author Ching Vang
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String aliasID;
    private String jobTitle;


    public Employee(String lname, String fname, String aliasid) {
        this.lastName = lname;
        this.firstName = fname;
        this.aliasID = aliasid;
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
