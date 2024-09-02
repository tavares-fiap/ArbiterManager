package Controller;

import Model.Manager;
import Model.Referee;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

public class Manager_Controller {

    private Map<String, Referee> referees = new HashMap<>();
    private Map<String, Manager> managers = new HashMap<>();
    private List<String> refereesNamesAndIdentifier = new ArrayList<>(); // para colocar na JComboBox
    private Manager loggedManager = null;

    public Manager getLoggedManager() {
        return loggedManager;
    }
    
    public boolean hasRegisteredUsers(){
        return !managers.isEmpty();
    }
    
    private boolean isRefereeRegistered(String cpf) {
        return referees.containsKey(cpf);
    }

    private boolean isManagerRegistered(String cpf) {
        return managers.containsKey(cpf);
    }
    
    public boolean addNewReferee(String cpf, String name, int totalGamesOfficiated) {
        if (!isRefereeRegistered(cpf)) {
            referees.put(cpf, new Referee(cpf, name, totalGamesOfficiated));
            return true;
        }
        return false;
    }

    public boolean signUp(String cpf, String name, String password) {
        if (!isManagerRegistered(cpf)) {
            managers.put(cpf, new Manager(cpf, name, password));
            loggedManager = managers.get(cpf);
            return true;
        }
        return false;
    }

    public boolean login(String cpf, String password) {
        if (managers.containsKey(cpf) && managers.get(cpf).getPassword().equals(password)) {
            loggedManager = managers.get(cpf);
            return true;
        }
        return false;
    }

    public boolean logout() {
        String response = JOptionPane.showInputDialog(null, "Deseja realmente realizar o LOGOUT?\n1 - Sim\n2 - Cancelar");
        if (loggedManager != null && Integer.parseInt(response) == 1) {
            loggedManager = null;
            return true;
        }
        return false;
    }
    
    
}
