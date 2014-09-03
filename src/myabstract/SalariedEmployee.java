
package myabstract;

/**
 *
 * @author Ching Vang
 */
public class SalariedEmployee extends Employee{
    private String name;
    private String aliasid;
    private String jobtitle;
    private double salary;

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

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    
}
