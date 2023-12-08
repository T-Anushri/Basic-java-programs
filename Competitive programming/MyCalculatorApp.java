import java.util.*;
class MyCalculator{
        long power(int n,int p) throws Exception{
        if(n<0||p<0)
            throw new Exception("n or p should not be negative");
        else if(n==0&&p==0)
            throw new Exception("n and p should not be zero");
        else
            return (long) Math.pow(n,p);
    }
}
class MyCalculatorApp{
    public static void main(String[] args){
        MyCalculator mc = new MyCalculator();
        int n,p;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        p = in.nextInt();
        try{
            long result = mc.power(n,p);
            System.out.println(result);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}