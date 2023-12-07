import java.util.Scanner;
class matrix{
    int row,col;
    int a[][] = new int[10][10];
    matrix()
    {
        System.out.println("Default constructor");
        row = 2;
        col = 2;
        print();
    }
    matrix(int r1,int c1){
        System.out.println("Parametric construictor");
        row = r1;
        col = c1;
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the values:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j] = read.nextInt();
            }
        }
        print();
    }
    matrix(matrix m){
        System.out.println("Copy constructor");
        row = m.row;
        col = m.col;
        a = m.a;
        print();
    }
    protected void finalize() throws Throwable{
        System.out.println("Deleted");
    }
    void print(){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(a[i][j]+" ");
        }
            System.out.println("");
        }
    }
}
class Matrices{
    public static void main(String args[]) throws Throwable{
        matrix m1 = new matrix();
        matrix m2 = new matrix(3,3);
        matrix m3 = new matrix(m2);
        m1.finalize();
        m2.finalize();
        m3.finalize();
    }
}