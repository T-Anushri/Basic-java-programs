import java.util.*;
class Solution{
    public static void main(String[] args) throws Exception{
        int b,h;
        Scanner in = new Scanner(System.in);
        b=in.nextInt();
        h=in.nextInt();
        try{
            if(b<=0||h<=0)
                throw new Exception("Breadth and Height mush be positive");
            else
                System.out.println("Area: "+ b*h);
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}