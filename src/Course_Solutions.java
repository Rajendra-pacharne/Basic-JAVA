import java.util.Scanner;

/*
Create a Class Course with below attributes:

CourseId - Int
CourseName - String
CourseRating - double
Mode - String
HaveCertificate - boolean

Write getters, setters and parameterized constructor as required.

Create class Solution with main method.

Implement static method - CountCourse in Solution class.

This method will take a String parameter and a double parameter along with the other parameter as array of Course objects.
The method will return the total number of courses which have certificate facility and the rating of the course object is greater
than or equal to the given parameter with match the mode(with case insensitive search).

If no count is there then print "No course found".

Consider below sample input and output:

Input 1:
------------
1001
Java
5
Online
True
1002
Python
3
Offline
False
1003
HTML
4
Offline
True
1004
JavaScript
2
Online
False
3
Online


Output 1:
------------
1
=========================================
Input 2:
------------
1001
Java
5
Online
True
1002
Python
3
Offline
False
1003
HTML
4
Offline
True
1004
JavaScript
2
Online
False
5
Offline

Output 2:
-------------
No course found
 */


public class Course_Solutions {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Course[] sub = new Course[4];
        for (int i = 0; i < 4; i++) {
            int id = s.nextInt();
           // s.nextLine(); // consume newline character
            String name = s.nextLine();
            s.nextLine();
            double rat = s.nextDouble();
           // s.nextLine(); // consume newline character
            String mode = s.nextLine();
            s.nextLine();
            boolean certi = s.nextBoolean();
            sub[i] = new Course(id, name, rat, mode, certi);
        }
       // s.nextLine();
        boolean newcerti = s.nextBoolean();
        s.nextLine();
        double newrat = s.nextDouble();
       // s.nextLine(); // consume newline character
        String newmode = s.nextLine();
        int data = CountCourse(sub, newcerti, newrat, newmode);
        if (data != 0) {
            System.out.println(data);
        } else {
            System.out.println("No course found");
        }
        s.close(); // close the scanner object
    }

    private static int CountCourse(Course[] sub, boolean newcerti, double newrat, String newmode) {
        int ct = 0;
        for (int i = 0; i < 4; i++) {
            if (sub[i].getMode().equalsIgnoreCase(newmode) && sub[i].isCerti() == newcerti && newrat >= sub[i].getRat()) {
                ct++;
            }
        }
        return ct;
    }
}

class Course {
    private int id;
    private String name;
    private double rat;
    private String mode;
    private boolean certi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRat() {
        return rat;
    }

    public void setRat(double rat) {
        this.rat = rat;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public boolean isCerti() {
        return certi;
    }

    public void setCerti(boolean certi) {
        this.certi = certi;
    }

    public Course(int id, String name, double rat, String mode, boolean certi) {
        this.id = id;
        this.name = name;
        this.rat = rat;
        this.mode = mode;
        this.certi = certi;
    }
}
