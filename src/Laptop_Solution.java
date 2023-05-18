import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Laptop_Solution {
    public static void main(String[] args) {
        LaptoP[] tab=new LaptoP[4];
        Scanner s=new Scanner (System.in);
        for(int i=0;i<4;i++)
        {
            int id=s.nextInt(); s.nextLine();
            String brand=s.nextLine();
            String ostype=s.nextLine();
            double price=s.nextDouble(); s.nextLine();
            int rating=s.nextInt(); s.nextLine();

            tab[i]=new LaptoP(id,brand,ostype,price,rating);


        }
        String brand=s.nextLine();
        String ostype=s.nextLine();
        int lapyc=countoflaptopbyostype(tab,brand);
        LaptoP[] newdata=findlaaptopbybrand(tab,ostype);
        if(lapyc>0)
        {
            System.out.println(lapyc);
        }
        else {
            System.out.println("null");
        }
        if(newdata!=null)
        {
            for (int i = 0; i <newdata.length ; i++) {
                System.out.println(newdata[i].getId()+"\n"+newdata[i].getRating());
            }

        }
        else {
            System.out.println("null");
        }

    }

    private static LaptoP[] findlaaptopbybrand(LaptoP[] tab, String ostype) {
//        LaptoP[] newinfo=new LaptoP[4];
//        for(int i=0;i<4;i++)
//        {
//            if(tab[i].getOstype().equalsIgnoreCase(ostype))
//            {
//                newinfo[i]= tab[i];
//            }
//        }
//        return newinfo;


        List<LaptoP> newinfo = new ArrayList<>();
        for(int i = 0; i < tab.length; i++) {
            if(tab[i].getOstype().equalsIgnoreCase(ostype)) {
                newinfo.add(tab[i]);
            }
        }
        return newinfo.toArray(new LaptoP[0]);
    }

    private static int countoflaptopbyostype(LaptoP[] tab, String brand) {
        int ct=0;
        for(int i=0;i<4;i++)
        {
            if(tab[i].getBrand().equalsIgnoreCase(brand))
            {
                ct++;
            }
        }
        return ct;
    }
}
class LaptoP
{
    int id;
    String brand;
    String ostype;
    double price;
    int rating;

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getOstype() {
        return ostype;
    }

    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    public LaptoP(int id, String brand, String ostype, double price, int rating) {
        this.id = id;
        this.brand = brand;
        this.ostype = ostype;
        this.price = price;
        this.rating = rating;
    }
}
