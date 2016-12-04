/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CareTeam;

import Business.Employee.Employee;
import Business.Organization.NurseOrganization;
import java.util.ArrayList;

/**
 *
 * @author Shubham
 */
public class CareTeam extends Employee {
    
    private ArrayList<Employee> careTeamList;
    
    public CareTeam(){
    careTeamList = new ArrayList<>();
    }

    public ArrayList<Employee> getCareTeamList() {
        return careTeamList;
    }

    public void setCareTeamList(ArrayList<Employee> careTeamList) {
        this.careTeamList = careTeamList;
    }

  
}
