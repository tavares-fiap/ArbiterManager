
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
    private String ranking; //representara nivel de experiencia

    public Referee(String cpf, String name, int totalMatchesOfficiated) {
        this.cpf = cpf;
        this.name = name;
        this.totalMatchesOfficiated = totalMatchesOfficiated;
        defineRanking(this.totalMatchesOfficiated);
    }
    
    public String getCpf() {
        return cpf;
    }

    public String getName() {
        return name;
    }

    public int getTotalMatchesOfficiated() {
        return totalMatchesOfficiated;
    }

    public String getRanking() {
        return ranking;
    }
    
    private void defineRanking(int totalMatchesOfficiated){
        if (totalMatchesOfficiated <= 50) {
            this.ranking = "Bronze";
        } else if (totalMatchesOfficiated <= 150) {
            this.ranking = "Prata";
        } else {
            this.ranking = "Ouro";
        }
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
        int matchId = matchesOfficiated.keySet().size();
        this.matchesOfficiated.put(ensureUniqueMatchId(matchId), match);
        this.matchesTeamsAndIdentifier.add(match.getHome() + " x " + match.getGuest() + " || " + matchId);
        this.totalMatchesOfficiated += 1;
        defineRanking(this.totalMatchesOfficiated);
    }
    
    public String[] getMatchesTeamsAndIdentifier() {
        this.matchesTeamsAndIdentifier.clear();
        for (int matchId : matchesOfficiated.keySet()) {
            this.matchesTeamsAndIdentifier.add(this.getMatch(matchId).getHome() + " x " + this.getMatch(matchId).getGuest() + " || " + matchId);
        }
        return matchesTeamsAndIdentifier.toArray(new String[matchesTeamsAndIdentifier.size()]);
    }
    
    public Match getMatch(int id){
        return this.matchesOfficiated.get(id);
    }
    
    public void deleteMatch(int matchId){
        this.matchesOfficiated.remove(matchId);
        this.totalMatchesOfficiated -= 1;
        defineRanking(this.totalMatchesOfficiated);
    }
    
    public boolean hasRegisteredMatches(){
        return !this.matchesOfficiated.isEmpty();
    }
    
    public void updateInfo(String name, int totalMatchesOfficiated, String ranking){
        this.name = name;
        this.totalMatchesOfficiated = totalMatchesOfficiated;
        this.ranking = ranking;
    }
    
    @Override
    public String toString(){
        return "\nNome: " + this.name + "\nNivel: " + this.ranking + "\nJogos Apitados: " + this.totalMatchesOfficiated;
    }
    
}
