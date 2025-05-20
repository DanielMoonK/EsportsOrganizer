import java.util.ArrayList;
import java.util.Scanner;

public class Organizer{
    private ArrayList<Roster> rosters;
    private ArrayList<Player> players;

    public Organizer(){
        rosters = new ArrayList<Roster>();
        players = new ArrayList<Player>();
    }

    // Searches for a specific player
    public Player findPlayer(String game, int osis){
        for(Player p: players){
            if(p.getID() == osis) return p;
        }
        return null;
    }

    // Creates a new roster with a specified game and empty player list
    public void newRoster(String g, int n){
        Scanner rosterScan = new Scanner(System.in);
        System.out.print("Game of roster: ");
        String game = rosterScan.nextLine();
        System.out.print("Minimum number of players: ");
        int num = rosterScan.nextInt();
        rosters.add(new Roster(game, num));
    }

    // Prompts the user with certain information, and creates a new player
    public void newPlayer(){
        Scanner playerScan = new Scanner(System.in);
        System.out.print("Their name: ");
        String name = playerScan.nextLine();
        System.out.print("Their email: ");
        String email = playerScan.nextLine();
        System.out.print("Their grade: ");
        int grade = playerScan.nextInt();
        System.out.print("Their osis: ");
        int osis = playerScan.nextInt();
        players.add(new Player(name, email, grade, osis));
    }

    //Adds a player to a specific roster
    public void addPlayerToRoster(String game, int osis){
        for(Roster r: rosters){
            if(r.getGame().equals(game)){
                for(Player p: players){
                    if(p.getID()==osis) r.addPlayer(p);
                }
            }
        }
    }
}