import java.util.ArrayList;
import java.util.Scanner;

public class Resort_solution {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Resort[] ret=new Resort[4];
        for (int i = 0; i <4 ; i++) {
            int id=s.nextInt(); s.nextLine();
            String name=s.nextLine();
            String Cat=s.nextLine();
            double price=s.nextDouble();
            int rating=s.nextInt();   s.nextLine();
            ret[i]=new Resort(id,name,Cat,price,rating);
        }

        String newCat=s.nextLine();
        ArrayList newdata=avgbycat(ret,newCat);
        if(newdata.size()>0)
        {
            for (Object i:newdata
                 ) {
                System.out.println(i);

            }
        }
        else {
            System.out.println("nothing will print ");
        }
    }

    private static ArrayList avgbycat(Resort[] ret, String newCat) {
        int ct=0;
        double sum=0;
        for (int i = 0; i <4 ; i++) {
            if(newCat.equalsIgnoreCase(ret[i].getCat()) && ret[i].getRating()>4)
            {
                ct++;
                sum=sum+ret[i].getPrice();
            }
        }
        ArrayList newinfo=new ArrayList();
        if(ct>0)
        {
            for (int i = 0; i <4 ; i++) {
                if(newCat.equalsIgnoreCase(ret[i].getCat()) && ret[i].getRating()>4)
                {
                    newinfo.add("resort have" + ret[i].getRating()+"star and average price:"+(sum/ct));
                }
            }
        }
        return newinfo;
    }
}
class Resort
{
    int id;
    String name;
    String Cat;
    double price;
    int rating;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCat() {
        return Cat;
    }

    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    public Resort(int id, String name, String cat, double price, int rating) {
        this.id = id;
        this.name = name;
        Cat = cat;
        this.price = price;
        this.rating = rating;
    }
}

/*
input


123
Sunset Resort
Beach
200.0
5
456
Moonlight Resort
Hill
150.0
4
789
Palm Resort
Beach
300.0
3
101
Mountain View Resort
Hill
250.0
5
Beach

 */