
package Model;


public class Match {
    private String location;
    private String home;
    private String guest;

    public Match(String location, String home, String guest) {
        this.location = location;
        this.home = home;
        this.guest = guest;
    }

    public String getHome() {
        return home;
    }

    public String getGuest() {
        return guest;
    }

    public String getLocation() {
        return location;
    }
    
    public void updateInfo(String location, String home, String guest){
        this.location = location;
        this.home = home;
        this.guest = guest;
    }
    
    @Override
    public String toString(){
        return "\nMandante: " + this.home + "\nVisitante: " + this.guest + "\nLocal: " + this.location;
    }
    
    
}
