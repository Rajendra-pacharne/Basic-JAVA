import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Student_solution {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Student[] stud=new Student[4];
        for (int i = 0; i < 4; i++) {
            int roll=s.nextInt(); s.nextLine();
            String name=s.nextLine();
            String branch=s.nextLine();
            double score=s.nextDouble(); s.nextLine();
            boolean dayscholar=s.nextBoolean();
            stud[i]=new Student(roll,name,branch,score,dayscholar);

        }
       // double newscore=s.nextDouble();

        int count=findCountOfDayscholarStudents(stud);
        ArrayList sehi=findStudentwithSecondHighestScore(stud);
        if(count>0)
        {
            System.out.println(count);
        }
        else {
            System.out.println("There are no such dayscholar students");
        }
        if(sehi.size()>0)
        {
            for(int i=0;i<sehi.size();i++)
            {
                System.out.println(sehi.get(i));
            }
        }
        else {
            System.out.println("There are no student from non day scholar");
        }

    }

    private static ArrayList findStudentwithSecondHighestScore(Student[] stud) {
        ArrayList newdata=new ArrayList();
        for (int i = 0; i <4 ; i++) {
            if(!stud[i].isDayscholar())
            {
                newdata.add(stud[i].getScore());
            }
        }
        Collections.sort(newdata);
        double sechigh= (double) newdata.get(newdata.size()-2);
        ArrayList onlydata=new ArrayList();
        for (int i = 0; i <4 ; i++) {
            if(stud[i].getScore()==sechigh)
            {
                onlydata.add(stud[i].getRoll()+"#"+stud[i].getName()+"#"+stud[i].getScore());
            }
        }
        return onlydata;
    }

    private static int findCountOfDayscholarStudents(Student[] stud) {
        int ct=0;
        for (int i = 0; i <4 ; i++) {
            if(stud[i].getScore()>80 && stud[i].isDayscholar())
            {
                ct++;
            }
        }
        return ct;
    }
}
class Student
{

    int roll;
    String name;
    String branch;
    double score;
    boolean dayscholar;

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public double getScore() {
        return score;
    }

    public boolean isDayscholar() {
        return dayscholar;
    }

    public Student(int roll, String name, String branch, double score, boolean dayscholar) {
        this.roll = roll;
        this.name = name;
        this.branch = branch;
        this.score = score;
        this.dayscholar = dayscholar;
    }
}