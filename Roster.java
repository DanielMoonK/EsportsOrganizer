import java.util.ArrayList;

public class Roster{
    private String game; //Name of the game
    private int numPlayers; //Minimum numpler of players for said game
    private ArrayList<Player> roster; //Array list of current roster
    private boolean registered;

    public Roster(String g, int n){
        game = g;
        numPlayers = n;
        registered = false; // Roster is automatically registered once it meets min player requirement
        roster = new ArrayList<Player>();
    }

    //Returns info about the roster
    public String toString(){
        return "Game: " + game + "\nNumber of players needed: " + numPlayers + "\nNumber of players in roster: " + roster.size();
    }

    //Adds a player to the roster, and includes the game into the player's list of games
    public void addPlayer(Player p){
        roster.add(p);
        p.addGames(game);
        if(roster.size()>=numPlayers) registered = true;
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
                if(roster.size()<numPlayers) registered = false;
                return true;
            }
        }
        return false;
    }

    // Returns the game name
    public String getGame(){
        return game;
    }

    // Returns the list of players
    public ArrayList<Player> getRoster(){
        return roster;
    }

    //Returns whether the roster is registered
    public boolean isRegistered(){
        return registered;
    }
}