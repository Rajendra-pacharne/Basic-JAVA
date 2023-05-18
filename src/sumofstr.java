import java.util.Scanner;

public class sumofstr
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            char n=str.charAt(i);
            int n1=Integer.parseInt(String.valueOf(n));
            System.out.println(n);
            if(n1>0 && n1<9)
            {
                sum+=n1;
            }
        }
        System.out.println(sum);
    }
}
