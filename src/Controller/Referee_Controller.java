
package Controller;

import Model.Referee;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Referee_Controller {
    private Map<String, Referee> referees = new HashMap<>();
    private List<String> refereesNamesAndIdentifier = new ArrayList<>(); // para colocar na JComboBox
    
    private boolean isRefereeCpfRegistered(String cpf) {
        return referees.containsKey(cpf);
    }
    
    public boolean addNewReferee(String cpf, String name, int totalGamesOfficiated) {
        if (!isRefereeCpfRegistered(cpf)) {
            referees.put(cpf, new Referee(cpf, name, totalGamesOfficiated));
            refereesNamesAndIdentifier.add(name + " || " + cpf);
            return true;
        }
        return false;
    }
    
    public String[] getRefereesNamesAndIdentifier() {
        refereesNamesAndIdentifier.clear();
        for (String cpf : referees.keySet()) {
            refereesNamesAndIdentifier.add(getReferee(cpf).getName() + " || " + cpf);
        }
        return refereesNamesAndIdentifier.toArray(new String[refereesNamesAndIdentifier.size()]);
    }
    
    public Referee getReferee(String cpf){
        return referees.get(cpf);
    }
    
    public void deleteReferee(String cpf){
        this.referees.remove(cpf);
    }
    
    public boolean hasRegisteredReferees(){
        return !referees.isEmpty();
    }
}
