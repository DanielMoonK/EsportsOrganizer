import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // Player MarkLee = new Player("Mark", "mlee@nycstudents.net", "mars", "mars2", 11, 212312332);
        // System.out.println(MarkLee);
        Scanner myScan = new Scanner(System.in);

        System.out.println("Welcome to the roster organizer. There are currently " + Roster.getNumRosters() + " registered rosters and " + Player.getNumPlayers() + " registered members.");
        System.out.print("Would you like to register a player or a roster? (Please use all lowercase)");
        String input = myScan.nextLine();
        if(input.equals("player")){
            registerPlayer();
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
        System.out.println("Their osis: ");
        int osis = playerScan.nextInt();
        return new Player(name, email, grade, osis);
    }

    
}