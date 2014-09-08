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


    public Employee(String name, String aliasid) {
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
    
    
    
    
}
