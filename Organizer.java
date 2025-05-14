import java.util.ArrayList;

public class Organizer{
    private ArrayList<Roster> organizer;

    public Organizer(ArrayList<Roster> o){
        organizer = o;
    }

    // Searches for a specific member in a game's roster, returning their info if found
    public String findPlayer(String game, String name, int osis){
        for(Roster r: organizer){
            if(r.getGame().equals(game)){
                return r.findPlayer(name, osis);
            }
        }
        return "Game not found";
    }
}