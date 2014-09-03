
package myinterface;

/**
 *
 * @author Ching Vang
 */
public interface Employee {
    public abstract void setStartDate();
    
    public abstract void setName(String name); 

    public abstract String getAliasid();
    
    public void setAliasid(String aliasid); 

    public String getJobtitle();

    public void setJobtitle(String jobtitle);
    
}
