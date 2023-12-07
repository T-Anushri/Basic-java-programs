import java.util.*;
class List{
    ArrayList<Integer>list = new ArrayList<>();
    public void create(){
        int x;
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the elements:");
        for(int i=0;i<3;i++)
        {
            x = read.nextInt();
            list.add(x);
        }
    }
    public void print(){
        System.out.println("The list is: "+list);
    }
}
class Stack extends List{
    protected void insert_end(){
        int x;
        System.out.println("Enter the element to be inserted:");
        Scanner read = new Scanner(System.in);
        x = read.nextInt();
        list.add(x);
    }
    protected void delete_end(){
        list.remove(list.size()-1);
    }
}
class Queue extends Stack{
    protected void delete_front(){
        list.remove(0);
    }
}
public class Inheritence{
    public static void main(String args[]){
        int choice;
        Scanner read = new Scanner(System.in);
        System.out.println("STACK");
        Stack s = new Stack();
        s.create();
        System.out.println("Enter 1 for insertion, 2 for deletion, 3 for print, 4 for exit:");
        do{
             System.out.println("Enter your choice:");
            choice = read.nextInt();
            switch(choice)
            {
                case 1:
                    s.insert_end();
                    break;
                case 2:
                    s.delete_end();
                    break;
                case 3:
                    s.print();
                    break;
                case 4:
                    System.out.println("EXIT!");
                    break;
                default:
                     System.out.println("Invalid choice");
            }
        }while(choice!=4);
        System.out.println("QUEUE");
        Queue q = new Queue();
        q.create();
        System.out.println("Enter 1 for insertion, 2 for deletion, 3 for print, 4 for exit:");
        do{
            System.out.println("Enter your choice:");
            choice = read.nextInt();
            switch(choice)
            {
                case 1:
                    q.insert_end();
                    break;
                case 2:
                    q.delete_front();
                    break;
                case 3:
                    q.print();
                    break;
                case 4:
                    System.out.println("EXIT!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=4);
    }
}
