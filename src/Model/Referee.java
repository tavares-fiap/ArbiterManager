
package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Referee{
    private String cpf;
    private String name;
    private int totalMatchesOfficiated;
    private Map<Integer, Match> matchesOfficiated = new HashMap<>();
    private List<String> matchesTeamsAndIdentifier = new ArrayList<>();
    private String level; //representara nivel de experiencia
    private int matchId;

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
    
    private boolean isMatchIdTaken(int id) {
        return matchesOfficiated.containsKey(id);
    }
    
    private int ensureUniqueMatchId(int id) {
        while (isMatchIdTaken(id)) {
            id++;
        }
        return id;
    }
    
    public void addNewMatch(Match match){
        this.matchId = matchesOfficiated.size();
        this.matchesOfficiated.put(ensureUniqueMatchId(matchId), match);
        this.matchesTeamsAndIdentifier.add(match.getHome() + " x " + match.getGuest() + " || " + totalMatchesOfficiated);
        this.totalMatchesOfficiated += 1;
    }
    
    public String[] getMatchesTeamsAndIdentifier() {
        return matchesTeamsAndIdentifier.toArray(new String[matchesTeamsAndIdentifier.size()]);
    }
    
    public Match getMatch(int id){
        return this.matchesOfficiated.get(id);
    }
    
    public void deleteMatch(int matchId){
        this.matchesOfficiated.remove(matchId);
        this.totalMatchesOfficiated -= 1;
    }
    
    @Override
    public String toString(){
        return "\nNome: " + this.name + "\nNivel: " + this.level + "\nJogos Apitados: " + this.totalMatchesOfficiated;
    }
    
}
