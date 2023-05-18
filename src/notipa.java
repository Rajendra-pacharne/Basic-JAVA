import java.util.ArrayList;
import java.util.Scanner;

public class notipa {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList arr=new ArrayList();
        for(int i=0;i<n;i++)
        {
            try {
                int r = s.nextInt();
                arr.add(r);

            }
            catch (Exception e)
            {

                break;
            }
        }

        ArrayList vs=validateScore(arr);
        if(vs.size()!=0)
        {
            for (Object i:vs) {

                System.out.print(i+" ");
            }
        }
        else {
            System.out.println("No valid score found");
        }

    }

    private static ArrayList validateScore(ArrayList arr) {
       ArrayList newone=new ArrayList();
        for (int i = 0; i < arr.size() ; i++) {
            int t=(int)arr.get(i);
          if(t<100 && t>1)
          {
              newone.add(t);
          }
        }
        return  newone;
    }
}
