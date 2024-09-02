package Controller;

import Model.Manager;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class Manager_Controller {

    private Map<String, Manager> managers = new HashMap<>();
    private Manager loggedManager = null;

    public Manager getLoggedManager() {
        return loggedManager;
    }
    
    public boolean hasRegisteredUsers(){
        return !managers.isEmpty();
    }

    private boolean isManagerRegistered(String cpf) {
        return managers.containsKey(cpf);
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
