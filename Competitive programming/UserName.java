import java.util.*;
class UserName{
    static int check(String un){
        if(un.length()<8 || un.length()>30)
            return 0;
        un=un.toLowerCase();
        char c=un.charAt(0);
        if(c<'a'||c>'z')
            return 0;
        for(int i=0;i<un.length();i++){
            c=un.charAt(i);
            if(c<'a'||c>'z')
                if((c<'0'||c>'9') && c!='_')
                        return 0;
        }
        return 1;
    }
    public static void main(String[] args){
        String un;
        Scanner in=new Scanner(System.in);
        un=in.nextLine();
        if(check(un)==0)
            System.out.println("INVALID");
        else    
            System.out.println("VALID");
    }
}