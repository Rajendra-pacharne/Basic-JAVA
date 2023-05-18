import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Document_Solution {
    public static void main(String[] args) {
        Document[] dox=new Document[4];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<4;i++)
        {
            int id=s.nextInt(); s.nextLine();
            String title=s.nextLine();
            String foldername=s.nextLine();
            int page=s.nextInt();s.nextLine();
            dox[i]=new Document(id,title,foldername,page);
        }
        ArrayList newdat=docsWithOddPages(dox);
        if(newdat.size()!=0)
        {
            for(Object i:newdat)
            {
                System.out.println(i);
            }
        }
        else
        {
            System.out.println("no record found");
        }


    }

    private static ArrayList docsWithOddPages(Document[] dox) {
        ArrayList newinfo=new ArrayList();
        for (int i = 0; i < 4; i++) {
            if(dox[i].getPage()%2!=0)
            {
                newinfo.add(dox[i].getId()+" "+dox[i].getTitle()+" "+dox[i].getFoldername()+" "+dox[i].getPage());
            }
        }

        return newinfo;

    }
}
class Document
{
    /*
    id - int
title - String
folderName - String
pages - int
     */

    int id;
    String title;
    String foldername;
    int page;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getFoldername() {
        return foldername;
    }

    public int getPage() {
        return page;
    }

    public Document(int id, String title, String foldername, int page) {
        this.id = id;
        this.title = title;
        this.foldername = foldername;
        this.page = page;
    }
}
/*   Input
1
resume
personal
50
2
question1
exams
55
3
question2
exams
45
4
India
misc
40
 */