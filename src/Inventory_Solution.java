import java.util.ArrayList;
import java.util.Scanner;

public class Inventory_Solution {
    public static void main(String[] args) {
        Inventory[] ureka=new Inventory[4];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<4;i++)
        {
            String id=s.nextLine();
            int maxquantity=s.nextInt(); s.nextLine();
            int currentquantity=s.nextInt(); s.nextLine();
            int threshold=s.nextInt();
            s.nextLine();
            ureka[i]=new Inventory(id,maxquantity,currentquantity,threshold);
        }
        int limit=s.nextInt(); s.nextLine();
        ArrayList newdata=Replenish(ureka,limit);
        if(newdata.size()>0)
        {
            for(Object i:newdata)
            {
                System.out.println(i);
            }
        }
        else {
            System.out.println("Nuull");
        }
    }

    private static ArrayList Replenish(Inventory[] ureka, int limit) {
        ArrayList newinfo=new ArrayList();
        for (int i = 0; i <4 ; i++) {
            if(limit>= ureka[i].getThreshold())
            {
                if(ureka[i].getThreshold()>75)
                {
                    newinfo.add(ureka[i].getId()+"Critical Filling");
                }
                else if (ureka[i].getThreshold()<75 && ureka[i].getThreshold()>50) {

                    newinfo.add(ureka[i].getId()+"Moderate Filling");
                }
                else {
                    newinfo.add(ureka[i].getId()+"Non-Critical Filling");
                }
            }
        }
        return newinfo;
    }
}
class Inventory
{
    /*
    inventoryId - String
maximumQuantity - int
currentQuantity - int
threshold - int
     */

    String id;
    int maxquantity;
    int currentquantity;
    int threshold;

    public String getId() {
        return id;
    }

    public int getMaxquantity() {
        return maxquantity;
    }

    public int getCurrentquantity() {
        return currentquantity;
    }

    public int getThreshold() {
        return threshold;
    }

    public Inventory(String id, int maxquantity, int currentquantity, int threshold) {
        this.id = id;
        this.maxquantity = maxquantity;
        this.currentquantity = currentquantity;
        this.threshold = threshold;
    }
}