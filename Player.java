public class Player{
    private String name;
    private int grade;
    private int idNumber;
    private String email;
    private String discordUser;
    private String hselUser;
    private int numStrikes;
    private static int numCurrentPlayers = 0;

    public Player(String n, String e, String d, String h, int g, int i){
        name = n;
        email = e;
        discordUser = d;
        hselUser = h;
        grade = g;
        idNumber = i;
        numCurrentPlayers++;
        numStrikes = 0;
    }

    public static void removeMember(){
        numCurrentPlayers--;
    }

    public static int getNumPlayers(){
        return numCurrentPlayers;
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

    public String getDiscUser(){
        return discordUser;
    }

    public String getHselUser(){
        return hselUser;
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

    public String toString(){
        return "Name: " + name + "\nGrade: " + grade + "th\nOsis: " + idNumber + "\nEmail: " + email + "\nDiscord User: " + discordUser + "\nHSEL User: " + hselUser + "\nNumber of Strikes: " + numStrikes;
    }
}