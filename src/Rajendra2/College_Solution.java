package Rajendra2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class College_Solution {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        College[] stud=new College[4];
        for(int i=0;i<4;i++)
        {
            int id=s.nextInt();  s.nextLine();
            String name=s.nextLine();
            int contact=s.nextInt();  s.nextLine();
            String address=s.nextLine();
            int pincode=s.nextInt(); s.nextLine();
            stud[i]=new College(id,name,contact,address,pincode);
        }
        String address=s.nextLine();
        ArrayList maxpin=findCollegeWithMaximumPincode(stud);
        ArrayList byadd=searchCollegeByAddress(stud,address);

        if(maxpin.size()>0)
        {
            for(Object i:maxpin)
            {
                System.out.println(i);
            }
        }
        else {
            System.out.println("null");
        }

        if(byadd.size()>0)
        {
            for(Object i:byadd)
            {
                System.out.println(i);
            }
        }
        else {
            System.out.println("null");
        }

    }

    private static ArrayList searchCollegeByAddress(College[] stud, String address) {
        ArrayList newdta2=new ArrayList();

        for(int i=0;i<4;i++)
        {
            if(stud[i].getAddress().equalsIgnoreCase(address))
            {
                newdta2.add(stud[i].getId()+"\n"+stud[i].getName()+"\n"+stud[i].getContact()+"\n"+stud[i].getPincode() +"\n"+stud[i].getAddress());
            }
        }
        return newdta2;
    }

    private static ArrayList findCollegeWithMaximumPincode(College[] stud) {
        ArrayList newdta=new ArrayList();
        for(int i=0;i<4;i++)
        {

                newdta.add(stud[i].getPincode());

        }
        Collections.sort(newdta);
        ArrayList newdta2=new ArrayList();
        int maxpin=(int) newdta.get(newdta.size()-1);
        for(int i=0;i<4;i++)
        {
            if(maxpin==stud[i].getPincode())
            {
                newdta2.add(stud[i].getId()+"\n"+stud[i].getName()+"\n"+stud[i].getContact()+"\n"+stud[i].getPincode() +"\n"+stud[i].getAddress());
            }
        }
        return newdta2;
    }
}
class College
{
    /*
     id-int

 name -String

 contactNo-int

 address-String

 pinCode-int
     */


    int id;
    String name;
    int contact;
    String address;
    int pincode;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getContact() {
        return contact;
    }

    public String getAddress() {
        return address;
    }

    public int getPincode() {
        return pincode;
    }

    public College(int id, String name, int contact, String address, int pincode) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.pincode = pincode;
    }
}
