/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myabstract;

/**
 *
 * @author Ching Vang
 */
public abstract class Employee {
    
    private String name;
    private String aliasid;
    private String jobtitle;

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
