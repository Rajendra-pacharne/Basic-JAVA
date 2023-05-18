package File_Operations;

import java.io.*;

public class filereaderandbufferreader {
    public static void main(String[] args) throws IOException
    {
        File dir=new File("PW");
        File file=new File("pw.txt");

//        FileWriter fw=new FileWriter(file);
//        BufferedWriter bw=new BufferedWriter(fw);
//        bw.write("JAVA");
//        bw.newLine();;
//        bw.write("Rajendra");
//        bw.newLine();;
//        bw.write("Pacharne");
//        bw.newLine();;
//        bw.write("Android");
//        bw.newLine();;
//        bw.write("Python");
//        bw.newLine();;


        FileReader fr=new FileReader(file);
        BufferedReader br=new BufferedReader(fr);

        String line=br.readLine();

        while(line!=null)
        {
            System.out.println(line);
            line=br.readLine();
        }
        System.out.println("File created and data read successfully");
//        bw.flush();
//        bw.close();
        br.close();
    }
}
