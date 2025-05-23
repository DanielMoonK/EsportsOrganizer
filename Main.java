import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // Player MarkLee = new Player("Mark", "mlee@nycstudents.net", "mars", "mars2", 11, 212312332);
        // System.out.println(MarkLee);
        Scanner myScan = new Scanner(System.in);
        Organizer myOrg = new Organizer();
        boolean running = true;

        System.out.println("Welcome to the roster organizer.");
        while(running){
            System.out.println("There are currently " + myOrg.numRegRosters() + " registered rosters and " + myOrg.numPlayers() + " registered members.");
            System.out.println("Would you like to: \nA) Register a player\nB) Register a roster\nC) View all players\nD) View all rosters\nE) Search for a player's info\nF) Add a player to a roster\nG) Add a strike to a player\nH) Remove a strike from a player\nZ) Exit");
            String input = myScan.nextLine();
            if(input.equals("A")){
                myOrg.newPlayer();
                System.out.println("Registered succefully");
            }
            if(input.equals("B")){
                myOrg.newRoster();
                System.out.println("Registered succefully");
            }
            if(input.equals("C")){
                System.out.println(myOrg.printPlayerNames());
            }
            if(input.equals("D")){
                System.out.println(myOrg.printRosters());
            }
            if(input.equals("E")){
                System.out.print("Enter the player's osis: ");
                int osis = myScan.nextInt();
                System.out.println(myOrg.findPlayer(osis));
            }
            if(input.equals("F")){
                System.out.println("Enter the game of the roster: ");
                String game = myScan.nextLine();
                System.out.println("Enter the player's osis: ");
                int osis = myScan.nextInt();
                myOrg.addPlayerToRoster(game, osis);
                System.out.println("Successfully added the player");
            }
            if(input.equals("G")){
                System.out.println("Enter the player's osis: ");
                int osis = myScan.nextInt();
                myOrg.applyStrike(osis);
                System.out.println("Strike applied");
            }
            if(input.equals("H")){
                System.out.println("Enter the player's osis: ");
                int osis = myScan.nextInt();
                myOrg.applyStrike(osis);
                System.out.println("Strike removed");
            }
            if(input.equals("Z")){
                System.out.println("Thank you for using the organizer.");
                running = false;
            }
            System.out.println();
        }
    }
}