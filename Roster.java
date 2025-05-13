import java.util.ArrayList;

public class Roster{
    private String game;
    private int numPlayers;
    private ArrayList<Player> roster;

    public Roster(String g, int n, Player[] r){
        game = g;
        numPlayers = n;
        roster = new ArrayList<Player>();
        for(int i=0; i<r.length; i++){
            roster.add(r[i]);
        }
    }

    public String toString(){
        String out = "";
        for(Player p: roster){
            out += p;
            out += "\n----------------------------------\n";
        }
        return out;
    }

    public boolean removePlayer(String name, int osis){
        for(int i=0; i<roster.size(); i++){
            if(roster.get(i).getName().equals(name)){
                if(roster.get(i).getID() == osis){
                    roster.remove(i);
                    return true;
                }
            }
        }
        return false;
    }
}