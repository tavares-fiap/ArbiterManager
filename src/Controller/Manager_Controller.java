
package Controller;

import Model.Manager;
import Model.Referee;
import java.util.HashMap;
import java.util.Map;


public class Manager_Controller {
    private Map<String, Referee> referees = new HashMap<>();
    private Map<String, Manager> managers = new HashMap<>();
    private Manager loggedManager = null;
    
    
    private boolean isRefereeRegistered(String cpf){
        return referees.containsKey(cpf);
    }
    
    private boolean isManagerRegistered(String cpf){
        return managers.containsKey(cpf);
    }
    
    public boolean addNewReferee(String cpf, String name, int totalGamesOfficiated){
        if (!isRefereeRegistered(cpf)) {
            referees.put(cpf, new Referee(cpf, name, totalGamesOfficiated));
            return true;
        }
        return false;
    }
    
    public boolean signUp(String cpf, String name, String password){
        if (!isManagerRegistered(cpf)) {
            managers.put(cpf, new Manager(cpf, name, password));
            loggedManager = managers.get(cpf);
            return true;
        }
        return false;
    }
    
    public boolean login(String cpf, String password){
        if (managers.containsKey(cpf) && managers.get(cpf).getPassword().equals(password)) {
            loggedManager = managers.get(cpf);
            return true;
        }
        return false;
    }
    
    public boolean logout(){
        if (loggedManager != null) {
            loggedManager = null;
            return true;
        }
        return false;
    }
}
