import java.util.Scanner;

public class Player_Solution {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Player[] gamer=new Player[4];
        for (int i = 0; i <4 ; i++) {
            int id=s.nextInt();
            s.nextLine();
            String skill=s.nextLine();
            String level=s.nextLine();
            int points=s.nextInt();
            s.nextLine();
            gamer[i]=new Player(id,skill,level,points);
        }
        String newskill=s.nextLine();
        String newlevel=s.nextLine();
        int sumofpoints=findPointsForGivenSkill(gamer,newskill);
        int playerbaselevel=getPlayerBasedOnLevel(gamer,newskill,newlevel);
        if(sumofpoints>0)
        {
            System.out.println(sumofpoints);
        }
        else {
            System.out.println("The given Skill is not available");
        }
        if(playerbaselevel>0)
        {
            System.out.println(playerbaselevel);
        }
        else {
            System.out.println("No player is available with specified level, skill \n" +
                    "and eligibility points");
        }

    }

    private static int getPlayerBasedOnLevel(Player[] gamer, String newskill, String newlevel) {

        for (int i = 0; i <4 ; i++) {
            if(gamer[i].getSkill().equalsIgnoreCase(newskill)
                    &&gamer[i].getLevel().equalsIgnoreCase(newlevel)
            && gamer[i].getPoints()>=20)
            {
                return gamer[i].getId();
            }
        }

        return 0;
    }

    private static int findPointsForGivenSkill(Player[] gamer, String newskill) {
    int sum=0;
    for(int i=0;i<4;i++)
    {
        if(gamer[i].getSkill().equalsIgnoreCase(newskill))
        {
            sum+=gamer[i].getPoints();
        }
    }

        return sum;
    }
}
class Player
{
    /*
    playerId - int
skill - String
level - String
points - int

     */

    private int id;
    private String skill;
    private String level;
    private int points;

    public int getId() {
        return id;
    }

    public String getSkill() {
        return skill;
    }

    public String getLevel() {
        return level;
    }

    public int getPoints() {
        return points;
    }

    public Player(int id, String skill, String level, int points) {
        this.id = id;
        this.skill = skill;
        this.level = level;
        this.points = points;
    }
}
