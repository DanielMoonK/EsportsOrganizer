import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        Organizer myOrg = new Organizer();
        boolean running = true;

        System.out.println("Welcome to the roster organizer.");
        while(running){
            System.out.println("There are currently " + myOrg.numRegRosters() + " registered rosters and " + myOrg.numPlayers() + " registered members.");
            System.out.println("Would you like to: \nA) Register a player\nB) Create a roster\nC) View all players\nD) View all players in a roster\nE) View all rosters\nF) Search for a player's info\nG) Add a player to a roster\nH) Add a strike to a player\nI) Remove a strike from a player\nJ) Remove a player from a roster\nK) Remove a player from the organization\nL) Remove a roster\nM) Register a roster\n\nZ) Exit");
            String input = myScan.nextLine();
            if(input.equals("A")){
                myOrg.newPlayer();
                System.out.println("Registered succefully");
            }
            if(input.equals("B")){
                myOrg.newRoster();
                System.out.println("Created succefully");
            }
            if(input.equals("C")){
                System.out.println(myOrg.printPlayerNames());
            }
            if(input.equals("D")){
                System.out.print("Enter the game of the roster: ");
                String game = myScan.nextLine();
                System.out.prinln(myOrg.printPlayerNamesInRoster(game));
            }
            if(input.equals("E")){
                System.out.println(myOrg.printRosters());
            }
            if(input.equals("F")){
                System.out.print("Enter the player's osis: ");
                int osis = myScan.nextInt();
                System.out.println(myOrg.findPlayer(osis));
            }
            if(input.equals("G")){
                System.out.print("Enter the game of the roster: ");
                String game = myScan.nextLine();
                System.out.println("Enter the player's osis: ");
                int osis = myScan.nextInt();
                myOrg.addPlayerToRoster(game, osis);
                System.out.println("Successfully added the player");
            }
            if(input.equals("H")){
                System.out.print("Enter the player's osis: ");
                int osis = myScan.nextInt();
                myOrg.applyStrike(osis);
                System.out.println("Strike applied");
            }
            if(input.equals("I")){
                System.out.print("Enter the player's osis: ");
                int osis = myScan.nextInt();
                myOrg.applyStrike(osis);
                System.out.println("Strike removed");
            }
            if(input.equals("J")){
                System.out.print("Enter the game of the roster: ");
                String game = myScan.nextLine();
                System.out.print("Enter the player's osis: ");
                int osis = myScan.nextInt();
                myOrg.removePlayerRoster(game, osis);
                System.out.println("Player removed successfully");
            }
            if(input.equals("K")){
                System.out.print("Enter the player's osis: ");
                int osis = myScan.nextInt();
                myOrg.removePlayer(osis);
                System.out.println("Player removed successfully");
            }
            if(input.equals("L")){
                System.out.print("Enter the game of the roster: ");
                String game = myScan.nextLine();
                myOrg.removeRoster(game);
                System.out.println("Roster removed successfully");
            }
            if(input.equals("M")){
                System.out.println("Enter the game of the roster: ");
                String game = myScan.nextLine();
                System.out.println(myOrg.registerRoster(game));
            }
            if(input.equals("Z")){
                System.out.println("Thank you for using the organizer.");
                running = false;
            }
            System.out.println();
        }
    }
}