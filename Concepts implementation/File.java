import java.util.*;
import java.io.*;
public class File {
    public static void main(String[] args){
        try{
            FileOutputStream fs = new FileOutputStream("file.txt",true);
            PrintStream p = new PrintStream(fs);
            int i=1;
            while(i<10){
                p.print(i + " , ");
                i++;
            }
            p.print(i);
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        try{
            FileInputStream fs = new FileInputStream("file.txt");
            Scanner s = new Scanner(fs);
            while(s.hasNextLine()){
                System.out.println(s.nextLine());
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}
