public class paliarray {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int al=arr1.length;
        int[] arr2=new int[al];

        for(int i=al-1;i>=0;i--)
        {
            for (int j = 0; j < al ; j++) {
                arr2[j]=arr1[i];
            }

        }
        for(int i=0;i<al;i++)
        {
            System.out.print(arr2[i]+" ");
        }

    }
}


// solve it