import java.util.ArrayList;
import java.util.Scanner;

public class Team_Solution {
    public static void main(String[] args) {
        Team[] gr=new Team[4];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            int id=s.nextInt();  s.nextLine();
            String name=s.nextLine();
            String country=s.nextLine();
            int runs=s.nextInt();  s.nextLine();
            gr[i]=new Team(id,name,country,runs);
        }
        int runs=s.nextInt();  s.nextLine();
        String country=s.nextLine();
        ArrayList newdata=findPlayer(gr,runs,country);
        if(newdata.size()>0)
        {
            for(Object i:newdata)
            {
                System.out.println(i);
            }
        }
        else {
            System.out.println("Chal Chal Avve ");
        }
    }

    private static ArrayList findPlayer(Team[] gr, int runs, String country) {
        ArrayList newinfo=new ArrayList();
        for(int i=0;i<3;i++)
        {
            if(gr[i].getCountry().equalsIgnoreCase(country) && gr[i].getRuns()>runs)
            {
                newinfo.add(gr[i].getId()+"\n"+gr[i].getName()+"\n"+gr[i].getCountry()+"\n"+gr[i].getRuns());
            }
        }
        return newinfo;
    }
}
class Team
{
    /*
    tId - int
tName - String
tCountry - String
tRun - int
     */
    int id;
    String name;
    String country;
    int runs;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getRuns() {
        return runs;
    }

    public Team(int id, String name, String country, int runs) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.runs = runs;
    }
}


/*

1
Arijit
India
43
2
Doremon
China
40
3
Donal
England
32
35
China
 */