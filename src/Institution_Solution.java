import java.util.Scanner;

public class Institution_Solution {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Institution[] clg=new Institution[4];
        for(int i=0;i<4;i++)
        {
            int id=s.nextInt();
            s.nextLine();
            String name=s.nextLine();
            int noofstudentplaced=s.nextInt();
            //  s.nextLine();
             int noofstudentcleared=s.nextInt();
            s.nextLine();
            String location=s.nextLine();
            //String grade=s.nextLine();
            clg[i]=new Institution(id,name,noofstudentplaced,noofstudentcleared,location);
        }
        String newlocation=s.nextLine();
        String newname=s.nextLine();
        s.nextLine();
        int sumofloca=FindNumClearancedByLoc(clg,newlocation);
        String somei=UpdateInstitutionGrade(clg,newname);
        if(sumofloca>0)
        {
            System.out.println(sumofloca);
        }
        else {
            System.out.println("NUL");
        }
        if(somei!=null)
        {
            System.out.println(somei);
        }
        else {
            System.out.println("NULL");
        }

    }

    private static String UpdateInstitutionGrade(Institution[] clg, String newname) {

        for(int i=0;i<4;i++)
        {
            if(newname.equalsIgnoreCase(clg[i].getName()))
            {
                int Rating=(clg[i].getNoofstudentplaced() * 100)/clg[i].getNoofstudentcleared();
                if(Rating>=80)
                {
                    return newname+"::"+"A";
                }
                else {
                    return newname+"::"+"B";
                }
            }
        }
        return null;
    }

    private static int FindNumClearancedByLoc(Institution[] clg, String newlocation) {
        int sum=0;
        for(int i=0;i<4;i++)
        {
            if(newlocation.equalsIgnoreCase(clg[i].getLocation()))
            {
                sum=sum+clg[i].getNoofstudentcleared();
            }
        }
        return sum;

    }
}
class Institution
{
    /*
    institutionId - int
institutionName - String
noOfStudentsPlaced - int
noOfStudentsCleared- int
location - String
grade - String
     */

    int id;
    String name;
    int noofstudentplaced;

    int noofstudentcleared;
    String location;
    String grade;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNoofstudentplaced() {
        return noofstudentplaced;
    }

    public int getNoofstudentcleared() {
        return noofstudentcleared;
    }

    public String getLocation() {
        return location;
    }

    public String getGrade() {
        return grade;
    }

    public Institution(int id, String name, int noofstudentplaced, int noofstudentcleared, String location) {
        this.id = id;
        this.name = name;
        this.noofstudentplaced = noofstudentplaced;
        this.noofstudentcleared = noofstudentcleared;
        this.location = location;

    }
}