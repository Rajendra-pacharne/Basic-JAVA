package Rajendra2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HeadSets_solution {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        HeadSets[] head=new HeadSets[4];
        for(int i=0;i<4;i++)
        {
            String name=s.nextLine();
            String brand=s.nextLine();
            int price=s.nextInt(); s.nextLine();
            boolean available=s.nextBoolean();  s.nextLine();
            head[i]=new HeadSets(name,brand,price,available);
        }
        String brand=s.nextLine();
        int cost=findTotalPriceForGivenBrand(head,brand);
        ArrayList newdta=findAvailableHeadsetWithSecondMinPrice(head);
        if(cost>0)
        {
            System.out.println(cost);
        }
        else{
            System.out.println("null");
        }
        if(newdta.size()>0)
        {
            for(Object i:newdta)
            {
                System.out.println(i);
            }
        }
        else {
            System.out.println("null");
        }
    }

    private static ArrayList findAvailableHeadsetWithSecondMinPrice(HeadSets[] head) {
      ArrayList newinfo=new ArrayList();
        for(int i=0;i<4;i++)
        {
            newinfo.add(head[i].getPrice());
        }
        Collections.sort(newinfo);
        int selow= (int) newinfo.get(1);
        ArrayList newinfo2=new ArrayList();
        for (int i = 0; i <4 ; i++) {
            if(selow==head[i].getPrice())
            {
                newinfo2.add(head[i].getname()+"\n"+head[i].getPrice());
            }
        }
        return newinfo2;
    }

    public static int findTotalPriceForGivenBrand(HeadSets[] head,String brand)
    {       int sum=0;int ct=0;
        for(int i=0;i<4;i++)
        {
            if(head[i].getBrand().equalsIgnoreCase(brand))
            {
                sum+=head[i].getPrice();
                ct++;
            }
        }
        return sum;
    }
}
class HeadSets
{
    /*
    headsetName - String
brand-String
price - int
available- boolean
     */

    String name;
    String brand;
    int price;
    boolean available;

    public String getname(){return name;}
    public String getBrand(){return brand;}
    public int getPrice(){return price;}
    public boolean getavailable(){return available;}

    public HeadSets(String name,String brand,int price,boolean available)
    {
        this.name=name;
        this.price=price;
        this.available=available;
        this.brand=brand;
    }

}
