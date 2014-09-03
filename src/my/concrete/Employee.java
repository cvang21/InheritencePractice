package my.concrete;

/**
 *
 * @author Ching Vang
 */
public class Employee {
    private String name;
    private String aliasid;
    private String jobtitle;


    public Employee(String name, String aliasid) {
        this.name = name;
        this.aliasid = aliasid;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAliasid() {
        return aliasid;
    }

    public void setAliasid(String aliasid) {
        this.aliasid = aliasid;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }
    
    
    
    
}
