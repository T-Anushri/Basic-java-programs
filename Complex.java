import java.util.*;
public class Complex{
    int a;
    int b;
    public Complex(){
        a=0;
        b=2;
    }
    public Complex(int m,int n){
        a=m;
        b=n;
    }
    public Complex(Complex m){
        a=m.a;
        b=m.b;
    }
    protected void finalize() throws Throwable{
        System.out.println("Object destroyed");
    }
    public static void main(String[] args)throws Throwable{
        Complex c1=new Complex();
        System.out.println("Using default constructor, Complex number:"+c1.a+"+i"+c1.b);
        Complex c2=new Complex(4,8);
        System.out.println("Using parametric constructor, Complex number:"+c2.a+"+i"+c2.b);
        Complex c3=new Complex(c2);
        System.out.println("Using copy constructor, Complex number:"+c3.a+"+i"+c3.b);
        c1.finalize();
        System.gc();
    }
}