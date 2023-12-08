import java.util.*;
class Split{
    public static void main(String[] args){
        String input;
        String res="";
        System.out.println("Enter a string:");
        Scanner in=new Scanner(System.in);
        input=in.nextLine();
        String[] strings=input.split(",");
        Arrays.sort(strings);
        for(String str:strings)
            res+=str+",";
        System.out.println(res);
    }
}