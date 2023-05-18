import java.util.Scanner;

public class word_count {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String lowerCase = str.toLowerCase();
        String arr[]=lowerCase.split(" ");
        int ct=0;
        for(int i=0;i< arr.length;i++)
        {

                char c = arr[i].charAt(0);
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
                {
                    ct++;
                }

        }
        if(ct>0)
        {
            System.out.println(ct);
        }
        else {
            System.out.println("Vowels not present");
        }
    }
}
