import java.util.Scanner;

public class gcode {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
            for (int i = n; i >=1; i--) {
                sum+=(i*i);
            }
        System.out.println(sum);
    }
}
