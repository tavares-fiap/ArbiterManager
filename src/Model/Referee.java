
package Model;

import java.util.HashMap;
import java.util.Map;


public class Referee{
    private String cpf;
    private String name;
    private int totalMatchesOfficiated;
    private Map<Integer, Match> matchesOfficiated = new HashMap<>();
    private String level; //representara nivel de experiencia

    public Referee(String cpf, String name, int totalMatchesOfficiated) {
        this.cpf = cpf;
        this.name = name;
        this.totalMatchesOfficiated = totalMatchesOfficiated;
        if (totalMatchesOfficiated <= 50) {
            this.level = "Bronze";
        } else if (totalMatchesOfficiated <= 150) {
            this.level = "Prata";
        } else {
            this.level = "Ouro";
        }
    }
    
    public void setLevel(String level) {
        this.level = level;
    }
    
    public void addNewMatch(Match match){
        matchesOfficiated.put(totalMatchesOfficiated, match);
        totalMatchesOfficiated += 1;
    }
    
    @Override
    public String toString(){
        return "\nNome: " + this.name + "\nNivel: " + this.level + "\nJogos Apitados: " + this.totalMatchesOfficiated;
    }
    
}
