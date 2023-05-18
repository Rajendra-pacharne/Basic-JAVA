import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Vegetable_Solution {
    public static void main(String[] args) {
        Vegetable[] fruit=new Vegetable[4];
        Scanner  s=new Scanner(System.in);
        for(int i=0;i<4;i++)
        {
            int id=s.nextInt(); s.nextLine();
            String name=s.nextLine();

            int price=s.nextInt();s.nextLine();
            int rat=s.nextInt();
            s.nextLine();
            fruit[i]=new Vegetable(id,name,price,rat);
        }
        int newrat=s.nextInt();s.nextLine();
        ArrayList<Object> newdata=new ArrayList<>();
        newdata=findMinimumPriceByRating(fruit,newrat);
        if(newdata!=null)
        {
            System.out.println(newdata.get(0));
        }
        else {
            System.out.println("No such Vegetables");
        }
    }

    private static ArrayList<Object> findMinimumPriceByRating(Vegetable[] fruit, int newrat) {
        ArrayList newinfo=new ArrayList();
        for(int i=0;i<4;i++)
        {
            if(fruit[i].getRat()>newrat)
            {
                newinfo.add(fruit[i].getPrice());
            }
        }
        Collections.sort(newinfo);
        ArrayList newinfo2=new ArrayList();
        if(newinfo.size()!=0) {
            int minp = (int) newinfo.get(0);
            for (int i = 0; i < 4; i++) {
                if (fruit[i].getRat() > newrat && minp == fruit[i].getPrice()) {
                    newinfo2.add(fruit[i].getId());
                }
            }

            return newinfo2;
        }
        else {
            return null;
        }

    }
}
class Vegetable
{
    int id;
    String name;

    int price;
    int rat;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getRat() {
        return rat;
    }

    public Vegetable(int id, String name, int price, int rat) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rat = rat;
    }
}