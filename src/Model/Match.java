
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
    
    public void updateMatchInfo(String location, String home, String guest){
        this.location = location;
        this.home = home;
        this.guest = guest;
    }
    
    
}
