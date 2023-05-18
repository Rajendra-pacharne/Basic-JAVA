import java.util.Scanner;

public class Phone_Solution {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Phone[] sim=new Phone[4];
        for (int i = 0; i <4 ; i++) {
             int id=s.nextInt();
             s.nextLine();
             String os=s.nextLine();
             String brand=s.nextLine();
             int price=s.nextInt();
             s.nextLine();
             sim[i]=new Phone(id,os,brand,price);
        }
        String newbrand=s.nextLine();
        String newos=s.nextLine();
        int sumofprice=findPriceForGivenBrand(sim,newbrand);
        if(sumofprice>0)
        {
            System.out.println(sumofprice);
        }
        else {
            System.out.println("The given Brand is not available");
        }
        int fos=getPhoneIdBasedOnOs(sim,newos);


        if(fos>0)
        {
            System.out.println(fos);
        }
        else {
            System.out.println("No phones are available with specified os and price range");
        }

    }

    private static int getPhoneIdBasedOnOs(Phone[] sim, String newos) {

        for (int i = 0; i <4 ; i++) {
            if(sim[i].getOs().equalsIgnoreCase(newos) && sim[i].getPrice()>=50000)
            {
                return sim[i].getId();
            }
        }
        return 0;
    }

    private static int findPriceForGivenBrand(Phone[] sim, String newbrand) {
    int sum=0;
        for (int i = 0; i <4 ; i++) {
            if(sim[i].getBrand().equalsIgnoreCase(newbrand))
            {
                sum+=sim[i].getPrice();
            }
        }
        return sum;
    }

}
class Phone
{
    private int id;
    private String os;
    private String brand;
    private int price;

    public int getId() {
        return id;
    }

    public String getOs() {
        return os;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public Phone(int id, String os, String brand, int price) {
        this.id = id;
        this.os = os;
        this.brand = brand;
        this.price = price;
    }
}