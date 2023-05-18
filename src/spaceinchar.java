import java.util.Scanner;

public class spaceinchar {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <str.length() ; i++) {
            sb.append(str.charAt(i)+"_");
        }
        System.out.println(sb);
    }
}
