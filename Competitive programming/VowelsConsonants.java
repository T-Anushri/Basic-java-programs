import java.util.*;
class VowelsConsonants{
    public static void main(String[] args){
        int v=0,c=0;
        String str;
        Scanner in=new Scanner(System.in);
        str=in.nextLine();
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
                v++;
            else if(str.charAt(i)>='a'&&str.charAt(i)<='z')
                c++;
        }
        System.out.println(v+" "+c);
    }
}