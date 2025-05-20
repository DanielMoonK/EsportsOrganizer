import java.util.ArrayList;

public class Roster{
    private String game; //Name of the game
    private int numPlayers; //Minimum numpler of players for said game
    private ArrayList<Player> roster; //Array list of current roster
    private boolean registered;

    public Roster(String g, int n){
        game = g;
        numPlayers = n;
        registered = false;
        roster = new ArrayList<Player>();
    }

    //Returns each member and information about member from the roster in sections
    public String toString(){
        String out = "";
        for(Player p: roster){
            out += p;
            out += "\n----------------------------------\n";
        }
        return out;
    }

    //Adds a player to the roster
    public void addPlayer(Player p){
        roster.add(p);
    }

    //Searches for a player in the roster, printing their info if found
    public Player findPlayer(String name, int osis){
        for(int i=0; i<roster.size(); i++){
            if(roster.get(i).getName().equals(name)){
                if(roster.get(i).getID() == osis){
                    return roster.get(i);
                }
            }
        }
        return null;
    }

    //Removes a member based on name and osis. If member exists, returns true. If not, return false.
    public boolean removePlayer(String name, int osis){
        for(int i=0; i<roster.size(); i++){
            if(roster.get(i).getName().equals(name)){
                if(roster.get(i).getID() == osis){
                    roster.get(i).removeGames(game);
                    roster.remove(i);
                    return true;
                }
            }
        }
        return false;
    }

    // Assigns a strike to every player in the roster
    public void rosterStrike(){
        for(Player p: roster){
            p.assignStrike();
        }
    }

    // Marks the roster as registered if the number of players are adequate
    public boolean register(){
        if(active()){
            registered = true;
        }
        return registered;
    }

    // Returns the game name
    public String getGame(){
        return game;
    }

    // Determines whether the roster has enough players to be competitively active
    public boolean active(){
        return roster.size() >= numPlayers;
    }
}