import java.util.*;
class matrix{    
    ArrayList<ArrayList<Integer>> mat;
    matrix(){
        System.out.println("Default constructor");
        mat = new ArrayList<ArrayList<Integer>>();
        mat.add(new ArrayList<Integer>());
        mat.get(0).addAll((Arrays.asList(0,0,0)));
        mat.add(new ArrayList<Integer>(Arrays.asList(0,0,0)));
        print(); 
    }
    matrix(int r1,int c1){   
        int x;
        mat = new ArrayList<ArrayList<Integer>>();
        System.out.println("Parametric construictor");
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the values:");
        for(int i=0;i<r1;i++){   
            mat.add(new ArrayList<Integer>());
            for(int j=0;j<c1;j++){   
                x = read.nextInt();
                mat.get(i).add(j,x); 
            }
        }
        print();  
    }
    matrix(matrix m){  
        System.out.println("Copy constructor");
        mat = new ArrayList<ArrayList<Integer>>();
        mat = m.mat;
        print();
    }
    protected void finalize() throws Throwable{  
        System.out.println("Deleted");
    }
    void print(){   
        for(int i=0;i<mat.size();i++){
            for(int j=0;j<mat.get(i).size();j++){
                System.out.print(mat.get(i).get(j)+" ");
            }
            System.out.println("");
        }
    }
}
class ListOfLists
{
    public static void main(String args[]) throws Throwable{   matrix m1 = new matrix();
        matrix m2 = new matrix(2,3);
        matrix m3 = new matrix(m2);
        m1.finalize();
        m2.finalize();
        m3.finalize(); }
}
