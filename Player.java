import java.util.ArrayList;

public class Player{
    private String name;
    private int grade;
    private int idNumber;
    private String email;
    private int numStrikes;
    private ArrayList<String> games;

    public Player(String n, String e, int g, int i){
        name = n;
        email = e;
        grade = g;
        idNumber = i;
        numStrikes = 0;
        games = new ArrayList<String>();
    }
    
    public void assignStrike(){
        numStrikes++;
    }

    public void removeStrike(){
        numStrikes--;
    }

    public void resetStrikes(){
        numStrikes = 0;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public int getGrade(){
        return grade;
    }

    public int getID(){
        return idNumber;
    }

    public int getStrikes(){
        return numStrikes;
    }

    public ArrayList<String> getGames(){
        return games;
    }

    public void addGames(String g){
        games.add(g);
    }

    public void removeGames(String g){
        for(int i=0; i<games.size(); i++){
            if(games.get(i)==g) games.remove(i);
        }
    }

    public String toString(){
        return "Name: " + name + "\nGrade: " + grade + "th\nOsis: " + idNumber + "\nEmail: " + email + "\nNumber of Strikes: " + numStrikes + "\nCurrently in: " + games;
    }
}