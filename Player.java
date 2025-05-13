public class Player{
    private String name;
    private int grade;
    private int idNumber;
    private String email;
    private String discordUser;
    private String hselUser;

    public Player(String n, String e, String d, String h, int g, int i){
        name = n;
        email = e;
        discordUser = d;
        hselUser = h;
        grade = g;
        idNumber = i;
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

    public String toString(){
        return "Name: " + name + "\nGrade: " + grade + "th\nOsis: " + idNumber + "\nEmail: " + email + "\nDiscord User: " + discordUser + "\nHSEL User: " + hselUser;
    }
}