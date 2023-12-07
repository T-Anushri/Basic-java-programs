import java.util.*;
public class Overload{
    static void concatenate(String s1,String s2){
        String res = s1.concat(s2);
        System.out.println("String 1: "+s1+" String 2: "+s2+" Result string: "+res);
    }
    static void concatenate(String s2){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string 1:");
        String s1 = in.nextLine();
        String res = s1.concat(s2);
        System.out.println("String 1: "+s1+" String 2: "+s2+" Result string: "+res);
    }
    static void concatenate(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string 1 and string 2:");
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        String res = s1.concat(s2);
        System.out.println("String 1: "+s1+" String 2: "+s2+" Result string: "+res);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string 1 and string 2:");
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        concatenate(s1,s2);
        concatenate(s2);
        concatenate();
    }
}