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
    public Player findPlayer(int osis){
        for(Player p: players){
            if(p.getID() == osis) return p;
        }
        return null;
    }

    // Creates a new roster with a specified game and empty player list
    public void newRoster(){
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

    //Removes a player from the player list
    public void removePlayer(int osis){
        for(int i=0; i<players.size(); i++){
            if(players.get(i).getID() == osis){
                for(String g: players.get(i).getGames()){
                    for(Roster r: rosters){
                        if(r.getGame().equals(g)){
                            r.removePlayer(osis);
                        }
                    }
                }
                players.remove(i);
                break;
            }
        }
    }

    //Removes a player from a roster
    public void removePlayerRoster(String game, int osis){
        for(Roster r: rosters){
            if(r.getGame().equals(game)){
                r.removePlayer(osis);
                break;
            }
        }
    }

    // Removes a roster, removing the game from the player's data then the whole list
    public void removeRoster(String game){
        for(int i=0; i<rosters.size(); i++){
            if(rosters.get(i).getGame().equals(game)){
                for(Player p: rosters.get(i).getRoster()){
                    p.removeGames(game);
                }
                rosters.remove(i);
                break;
            }
        }
    }

    //Returns number of registered rosters
    public int numRegRosters(){
        int count = 0;
        for(Roster r: rosters){
            if(r.isRegistered()) count++;
        }
        return count;
    }

    //Returns number of players
    public int numPlayers(){
        return players.size();
    }

    //Returns a string of all the players names
    public String printPlayerNames(){
        String names = "";
        for(Player p: players){
            names += p.getName() + ", ";
        }
        return names;
    }

    //Returns a string of all rosters
    public String printRosters(){
        String total = "";
        for(Roster r: rosters){
            total = r.toString() + "\n--------------------------------------------\n";
        }
        return total;
    }

    public String printPlayerNamesInRoster(String game){
        String total = "";
        for(Roster r: rosters){
            if(r.getGame().equals(game)){
                for(Player p: r.getRoster()){
                    total += p.getName() + ", ";
                }
            }
        }
        return total;
    }

    //Applies a strike to a player
    public void applyStrike(int osis){
        for(Player p: players){
            p.assignStrike();
        }
    }

    //Registers the roster in quesetion, unless the game does not exist or roster does not have enough players
    public String registerRoster(String game){
        for(Roster r: rosters){
            if(r.getGame().equals(game)){
                if(r.register()) return "Registered " + game + " successfully";
            }
        }
        return "Registration failed";
    }
}