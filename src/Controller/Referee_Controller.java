
package Controller;

import Model.Referee;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Referee_Controller {
    private Map<String, Referee> referees = new HashMap<>();
    private List<String> refereesNamesAndIdentifier = new ArrayList<>(); // para colocar na JComboBox
    
    private boolean isRefereeRegistered(String cpf) {
        return referees.containsKey(cpf);
    }
    
    public boolean addNewReferee(String cpf, String name, int totalGamesOfficiated) {
        if (!isRefereeRegistered(cpf)) {
            referees.put(cpf, new Referee(cpf, name, totalGamesOfficiated));
            refereesNamesAndIdentifier.add(name + " || " + cpf);
            return true;
        }
        return false;
    }
    
    public String[] getRefereesNamesAndIdentifier() {
        return refereesNamesAndIdentifier.toArray(new String[refereesNamesAndIdentifier.size()]);
    }
    
    public Referee getReferee(String cpf){
        return referees.get(cpf);
    }
    public String extractIdentifier(String nameAndIdentifier) {
        String[] splitedNameAndIdentifier = nameAndIdentifier.split(" ");
        return splitedNameAndIdentifier[splitedNameAndIdentifier.length - 1]; 
    }
}
