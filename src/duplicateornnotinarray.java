import java.util.Scanner;

public class duplicateornnotinarray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr={1,1,2,3,4,5,5};
        int n= arr.length;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                if(arr[i]==arr[j])
                {
                    System.out.println("duplicate found "+ arr[i]);
                }
            }
        }
    }
}
