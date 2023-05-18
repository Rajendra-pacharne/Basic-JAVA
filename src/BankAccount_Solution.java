import java.util.Scanner;

public class BankAccount_Solution {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        BankAccount[] acc=new BankAccount[4];
        for(int i=0;i<4;i++)
        {
            String number=s.nextLine();
            String name=s.nextLine();
            double  balance=s.nextDouble();
            s.nextLine();
            acc[i]=new BankAccount(number,name,balance);
        }
        String fromAccount=s.nextLine();
        String toAccount=s.nextLine();

    }
}
class BankAccount {
    /*
    accountNumber (String)
accountHolderName (String)
balance (double)
     */
        String number;
        String name;
        double  balance;

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public BankAccount(String number, String name, double balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }
}