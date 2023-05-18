
   import java.util.Scanner;

    public class countofvowel {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String str = input.nextLine();
            str = str.toLowerCase();
            int count = 0;
            String[] words = str.split("\\s+");
            for (String word : words) {
                char firstChar = word.charAt(0);
                if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u')
                {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
