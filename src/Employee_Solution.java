import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Employee_Solution {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Employee[] emp=new Employee[4];
        for (int i = 0; i < 4; i++) {
            int id = s.nextInt();
            s.nextLine();
            String name = s.nextLine();
            String branch = s.nextLine();
            double rating = s.nextDouble();
            boolean transport = Boolean.parseBoolean(s.next());
            s.nextLine();
            emp[i] = new Employee(id, name, branch, rating, transport);
        }
        String newbranch = s.nextLine();
        int countofemp=findCountOfEmployeesUsingCompTransport(emp,newbranch);
        ArrayList newdata=new ArrayList();
        newdata = findEmployeeWithSecondHighestRating(emp);

        if(countofemp!=0)
        {
            System.out.println(countofemp);
        }
        else {
            System.out.println("No such Employees");
        }
        if(newdata.size()!=0)
        {
            for (int i = newdata.size()-1; i >=0 ; i--) {
                System.out.println(newdata.get(i));
            }
        }
        else {
            System.out.println("All Employees using company transport");
        }

    }

    private static ArrayList findEmployeeWithSecondHighestRating(Employee[] emp) {
    ArrayList newinfo =new ArrayList();
    ArrayList arr=new ArrayList();
        for (int i = 0; i <4 ; i++) {
            if(!emp[i].gettransport())
            {
                newinfo.add(emp[i].getRating());
            }
        }
        Collections.sort(newinfo);
        double sera= (double) newinfo.get(newinfo.size()-2);

        for (int i = 0; i <4 ; i++) {
            if(!emp[i].gettransport() && emp[i].getRating()==sera)
            {
                arr.add(emp[i].getId()+"\n"+emp[i].getName());
            }
        }

        return arr;

    }

    private static int findCountOfEmployeesUsingCompTransport(Employee[] emp, String newbranch) {
    int ct=0;
        for (int i = 0; i <4 ; i++) {
            if(emp[i].getBranch().equalsIgnoreCase(newbranch))
            {
                ct++;
            }
        }
        return ct;
    }
}
class Employee
{
    /*
    employeeld - int
name - String
branch - String
rating - double
company Transport - boolean
     */

   private int id;
    private String name;
    private String branch;
    private double rating;
    private boolean transport;

    public int getId(){return id;}
    public String getName(){return name;}
    public String getBranch(){return branch;}
    public double getRating(){return rating;}
    public boolean gettransport(){return transport;}

    public Employee(int id,String name ,String branch,double rating,boolean transport)
    {
        this.id=id;
        this.name=name;
        this.branch=branch;
        this.rating=rating;
        this.transport=transport;
    }
}
