import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // Player MarkLee = new Player("Mark", "mlee@nycstudents.net", "mars", "mars2", 11, 212312332);
        // System.out.println(MarkLee);
        Scanner myScan = new Scanner(System.in);
        Organizer myOrg = new Organizer();

        System.out.println("Welcome to the roster organizer. There are currently " + Roster.getNumRosters() + " registered rosters and " + Player.getNumPlayers() + " registered members.");
        System.out.print("Would you like to register a player or a roster? (Please use all lowercase) ");
        String input = myScan.nextLine();
        if(input.equals("player")){
            myOrg.newPlayer();
        }
        if(input.equals("roster")){
            myOrg.newRoster();
            
        }
    }

    public static Player findPlayer(ArrayList<Player> arrayPlayer, int osis){
        for(Player p: arrayPlayer){
            if(p.getID() == osis){
                return p;
            }
        }
        return null;
    }
}