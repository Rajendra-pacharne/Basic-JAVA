import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution_Hotel {
    public static void main(String[] args) {
        Hotel[] oyy=new Hotel[4];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<4;i++)
        {
            int id=s.nextInt(); s.nextLine();
            String name=s.nextLine();
            String date=s.nextLine();
            int noofroom=s.nextInt();s.nextLine();
            String wifi=s.nextLine();
            double  bill=s.nextDouble(); s.nextLine();
            oyy[i]=new Hotel(id,name,date,noofroom,wifi,bill);
        }
        String newdate=s.nextLine();
        String newwifi=s.nextLine();
        int croom=noofroominmonth(oyy,newdate);
        ArrayList iswifi=idbyhighestbill(oyy,newwifi);

        if(croom>0)
        {
            System.out.println(croom);
        }
        else {
            System.out.println("no month found");
        }

        if(iswifi.size()>0)
        {
            for (int i = 0; i <iswifi.size() ; i++) {
                System.out.println(iswifi.get(i));
            }

        }
        else {
            System.out.println("no month found");
        }

    }

    private static ArrayList idbyhighestbill(Hotel[] oyy, String newwifi) {
        ArrayList price=new ArrayList();
        for(int i=0;i<4;i++)
        {
            if(oyy[i].getWifi().equalsIgnoreCase(newwifi))
            {
                price.add(oyy[i].getBill());
            }
        }
        Collections.sort(price);
        double sp= (double) price.get(price.size()-2);
        ArrayList newdata=new ArrayList();
        for(int i=0;i<4;i++)
        {
            if(oyy[i].getWifi().equalsIgnoreCase(newwifi) && sp==oyy[i].getBill())
            {
               newdata.add(oyy[i].getId());
            }
        }
        return newdata;

    }

    private static int noofroominmonth(Hotel[] oyy, String newdate) {
        int ct=0;
        for(int i=0;i<4;i++)
        {
            if(oyy[i].getDate().contains(newdate))
            {
                return oyy[i].getNoofroom();
            }
        }
        return ct;
    }
}
class Hotel
{
    int id;
    String name;
    String date;
    int noofroom;
    String wifi;
    double  bill;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public int getNoofroom() {
        return noofroom;
    }

    public String getWifi() {
        return wifi;
    }

    public double getBill() {
        return bill;
    }

    public Hotel(int id, String name, String date, int noofroom, String wifi, double bill) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.noofroom = noofroom;
        this.wifi = wifi;
        this.bill = bill;
    }
}

/*
101
best stay
01-jan-2022
10
Yes
20000
102
Apple Stay
12-Feb-2022
3
Yes
4000
103
accord
11-may-22
5
Yes
15000
104
Royal Park
22-Dec-2021
7
yes
12000
may
yes
 */