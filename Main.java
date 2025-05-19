import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // Player MarkLee = new Player("Mark", "mlee@nycstudents.net", "mars", "mars2", 11, 212312332);
        // System.out.println(MarkLee);
        Scanner myScan = new Scanner(System.in);
        ArrayList<Player> players = new ArrayList<Player>();
        ArrayList<Roster> rosters = new ArrayList<Roster>();

        System.out.println("Welcome to the roster organizer. There are currently " + Roster.getNumRosters() + " registered rosters and " + Player.getNumPlayers() + " registered members.");
        System.out.print("Would you like to register a player or a roster? (Please use all lowercase) ");
        String input = myScan.nextLine();
        if(input.equals("player")){
            players.add(registerPlayer());
        }
        if(input.equals("roster")){
            
        }
    }

    public static Player registerPlayer(){
        Scanner playerScan = new Scanner(System.in);
        System.out.print("Their name: ");
        String name = playerScan.nextLine();
        System.out.print("Their email: ");
        String email = playerScan.nextLine();
        System.out.print("Their grade: ");
        int grade = playerScan.nextInt();
        System.out.print("Their osis: ");
        int osis = playerScan.nextInt();
        return new Player(name, email, grade, osis);
    }

    public static Roster registerRoster(){
        Scanner rosterScan = new Scanner(System.in);
        System.out.println("Game of roster: ");
        String game = rosterScan.nextLine();
        System.out.println("Number of players needed in roster: ");
        int num = rosterScan.nextInt();
        ArrayList<Player> rosterPlayers = new ArrayList<Player>();
        int osis = 1;
        while(osis != 0){
            System.out.println("OSIS of player to add: (Type 0 if no longer adding) ");
            osis = rosterScan.nextInt();
            if(osis == 0) break;
            rosterPlayers.add()
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