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

    //Returns info about the roster
    public String toString(){
        return "Game: " + game + "\nNumber of players needed: " + numPlayers + "\n Number of players in roster: " + roster.size();
    }

    //Adds a player to the roster, and includes the game into the player's list of games
    public void addPlayer(Player p){
        roster.add(p);
        p.addGames(game);
    }

    //Searches for a player in the roster, printing their info if found
    public Player findPlayer(int osis){
        for(int i=0; i<roster.size(); i++){
            if(roster.get(i).getID() == osis){
                return roster.get(i);
            }
        }
        return null;
    }

    //Removes a member based on osis. If member exists, returns true. If not, return false.
    public boolean removePlayer(int osis){
        for(int i=0; i<roster.size(); i++){
            if(roster.get(i).getID() == osis){
                roster.get(i).removeGames(game);
                roster.remove(i);
                return true;
            }
        }
        return false;
    }

    // Marks the roster as registered if the number of players are adequate
    public boolean register(){
        if(this.active()){
            registered = true;
        }
        return registered;
    }

    // Returns the game name
    public String getGame(){
        return game;
    }

    // Returns the list of players
    public ArrayList<Player> getRoster(){
        return roster;
    }

    // Determines whether the roster has enough players to be competitively active
    public boolean active(){
        return roster.size() >= numPlayers;
    }

    //Returns whether the roster is registered
    public boolean isRegistered(){
        return registered;
    }
}