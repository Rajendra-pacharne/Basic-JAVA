import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Antenna_Solution {
    public static void main(String[] args) {
        Antenna[] tv=new Antenna[4];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<4;i++)
        {
            int id=s.nextInt(); s.nextLine();
            String name=s.nextLine();
            String lead=s.nextLine();
            double ante=s.nextDouble();
            tv[i]=new Antenna(id,name,lead,ante);
        }
        s.nextLine();
        String newname=s.nextLine();

        double ante=s.nextDouble(); //s.nextLine();
        int atid=searchAntennaByName(tv,newname);
        ArrayList lessvswr=sortAntennaByVSWR(tv,ante);

        if(atid>0)
        {
            System.out.println(atid);
        }
        else {
            System.out.println("There is no antenna with given parameter");
        }
        if(lessvswr.size()!=0)
        {
            for (int i = lessvswr.size()-1; i >=0 ; i--) {
                System.out.println(lessvswr.get(i));
            }
        }
        else {
            System.out.println("No Antenna found");
        }
    }

    private static ArrayList sortAntennaByVSWR(Antenna[] tv, double ante) {
       ArrayList newdata=new ArrayList();
        for (int i = 0; i <4 ; i++) {

            if(ante>tv[i].getAnte())
            {
                newdata.add(tv[i].getLead());
            }
        }
        Collections.sort(newdata);
        return newdata;

    }

    private static int searchAntennaByName(Antenna[] tv, String newname) {

        for (int i = 0; i <4 ; i++) {

            if(tv[i].getName().equalsIgnoreCase(newname))
            {

                return tv[i].getId();
            }
        }
        return 0;
    }
}
class Antenna
{
    /*
    antennaid=int
antennaName=String
projectLead=String
antennaVSWR=double
     */
    int id;
    String name;
    String lead;
    double ante;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLead() {
        return lead;
    }

    public double getAnte() {
        return ante;
    }

    public Antenna(int id, String name, String lead, double ante) {
        this.id = id;
        this.name = name;
        this.lead = lead;
        this.ante = ante;
    }
}