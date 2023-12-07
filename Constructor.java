import java.util.*;
class Vector{
    ArrayList<Integer>list;
    public Vector(){
        list=new ArrayList<Integer>();
        list.add(3);
    }
    public Vector(ArrayList<Integer>list){
        this.list=list;
        list.add(2);
    }
    public Vector(Vector v){
        this.list=v.list;
    }
    public void print(){
        System.out.println(list);
    }
}
public class Constructor{
    public static void main(String[] args){
        System.out.println("Default constructor:");
        Vector v1=new Vector();
        v1.print();
        System.out.println("Parametric constructor:");
        ArrayList<Integer>l=new ArrayList<Integer>();
        l.add(5);
        l.add(7);
        Vector v2=new Vector(l);
        v2.print();
        System.out.println("Copy constructor:");
        Vector v3=new Vector(v2);
        v3.print();
    }
}