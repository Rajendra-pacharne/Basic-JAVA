import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution_Engine {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Engine[] car=new Engine[4];
        for(int i=0;i<4;i++)
        {
            int id=s.nextInt(); s.nextLine();
            String name=s.nextLine();
            String type=s.nextLine();
            double price=s.nextInt();  s.nextLine();
            car[i]=new Engine(id,name,type,price);
        }
        String type=s.nextLine();
        String name=s.nextLine();
        int avgbt=findAvgEnginePriceByType(car,type);
        ArrayList newdata=searchEngineByName(car,name);
        if(avgbt>0)
        {
            System.out.println(avgbt);
        }
        else {
            System.out.println("NULL");
        }
        if(newdata.size()>0)
        {
            for(Object i:newdata)
            {
                System.out.println(i);
            }
        }
        else
        {
            System.out.println("null");
        }
    }

    private static ArrayList searchEngineByName(Engine[] car, String name) {
        ArrayList newinfo=new ArrayList();
        for(int i=0;i<4;i++)
        {
            if(name.equalsIgnoreCase(car[i].getName()))
            {
                newinfo.add(car[i].getId());
            }
        }
        Collections.sort(newinfo);
        return newinfo;
    }

    private static int findAvgEnginePriceByType(Engine[] car, String type) {
        int ct=0;double sum=0;
        for(int i=0;i<4;i++)
        {
            if(type.equalsIgnoreCase(car[i].getType()))
            {
                ct++;
                sum=sum+car[i].getPrice();
            }
        }
        return (int)sum/ct;
    }
}
class Engine
{
    int id;
    String name;
    String type;
    double price;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public Engine(int id, String name, String type, double price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
    }
}

/*
input
1001
Maruti
Diesel
20000
1002
Kia
Pertro
17000
1003
Hyundai
Diesel
24000
1000
Maruti
Petrol
27500
Petrol
Maruti


 */