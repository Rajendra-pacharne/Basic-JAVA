import java.util.Scanner;

public class primenumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int start=s.nextInt();
        int end=s.nextInt();
        for(int i=start;i<=end;i++)
        {
            if(isprime(i))
            {
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isprime(int num)
    {   int ct=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                ct++;
            }
        }
        if(ct==2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
