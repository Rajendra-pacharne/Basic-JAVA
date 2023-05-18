import java.util.Scanner;

public class newspaper_solution {
    public static void main(String[] args) {
        newspaper[] paper=new newspaper[4];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<4;i++)
        {
            int regno=s.nextInt(); s.nextLine();
            String name=s.nextLine();
            int year=s.nextInt();
            //s.nextLine();
            int price=s.nextInt();// s.nextLine();

            paper[i]=new newspaper(regno,name,year,price);
        }
        int newyear=s.nextInt();
        s.nextLine();
        String newname=s.nextLine();
        int yd=findTotalPriceByPublicationYear(paper,newyear);
        newspaper newdata=searchNewspaperByName(paper,newname);
        if(yd!=0)
        {
            System.out.println(yd);
        }
        else {
            System.out.println("No Newspaper found with the mentioned attribute");
        }
        if(newdata!=null)
        {
            System.out.println(newdata.getRegno());
            System.out.println(newdata.getName());
            System.out.println(newdata.getYear());
            System.out.println(newdata.getPrice());
        }
        else{
            System.out.println("NULL");
        }
    }

    private static newspaper searchNewspaperByName(newspaper[] paper, String newname) {
        for (int i = 0; i <4 ; i++) {
           // System.out.println(newname);
            if(paper[i].getName().equalsIgnoreCase(newname))
            {
                //System.out.println(paper[i].getName() +" "+newname);
                return paper[i];
            }
        }
        return null;
    }

    private static int findTotalPriceByPublicationYear(newspaper[] paper, int newyear) {
       int tot=0;
        for(int i=0;i<4;i++)
        {
            if(newyear==paper[i].getYear())
            {
                tot+=paper[i].getPrice();
            }
        }
        return tot;
    }
}
class newspaper
{
            int regno;
            String name;
            int year;
            int price;

    public int getRegno() {
        return regno;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public newspaper(int regno, String name, int year, int price) {
        this.regno = regno;
        this.name = name;
        this.year = year;
        this.price = price;
    }
}