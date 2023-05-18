public class enumoperation {
    public static void main(String[] args) {
        System.out.println("Enum");

        result.PASS.setmarks(90);
        int m1=result.PASS.getMarks();
        System.out.println("Marks :"+m1);

        result.FAIL.setmarks(45);
        int m2=result.FAIL.getMarks();
        System.out.println("Marks :"+m2);
    }
}

enum result
{
   PASS,FAIL,NR;
   int marks;

   result()
   {
       System.out.println("Constructor");
   }
   void setmarks(int marks)
   {
       this.marks=marks;
   }

   int getMarks()
   {
       return marks;
   }
}