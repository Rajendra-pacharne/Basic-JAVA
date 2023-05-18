import java.util.ArrayList;
import java.util.Scanner;

public class dry {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList arr=new ArrayList();
        for (int i = 0; i <n ; i++) {
            int t=s.nextInt();
            arr.add(t);
        }
        System.out.println(arr);
    }
}
