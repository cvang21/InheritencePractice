
package myabstract;

/**
 *
 * @author Ching Vang
 */
public class SalaryPlusCommisionEmployee extends SalariedEmployee {
    
    private String name;
    private String aliasid;
    private String jobtitle;
    private String salary;

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

    @Override
    public String getSalary() {
        return salary;
    }

    @Override
    public void setSalary(String salary) {
        this.salary = salary;
    }
    
}
