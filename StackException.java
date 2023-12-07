import java.util.*; 
class st{ 
    int top=-1; 
    void push(int a,int st[],int n){ 
        try { 
            if(top==n-1) 
            throw new ArrayIndexOutOfBoundsException("Stack overflow"); 
            else 
            st[++top]=a; 
        } 
        catch(Exception ex) { 
            System.out.println(ex); 
        } 
    } 
    void pop(int st[]){ 
        try{ 
            if(top==-1) 
            throw new ArrayIndexOutOfBoundsException("Stack underflow"); 
            else 
            System.out.println("Popped element is: "+st[top--]); 
        } 
        catch(Exception ex){ 
            System.out.println(ex); 
        } 
    } 
} 
class StackException{ 
    public static void main(String[] args){ 
        Scanner in=new Scanner(System.in); 
        int n; 
        System.out.println("Enter the size of the stack:"); 
        n=in.nextInt(); 
        int st[]=new int[n]; 
        int choice,ele; 
        st ob=new st(); 
        do 
        { 
            System.out.println("\nEnter 1-push, 2-pop, 3-exit:"); 
            choice=in.nextInt(); 
            switch(choice)
            { 
                case 1: 
                System.out.println("Enter element to be pushed:"); 
                ele=in.nextInt(); 
                ob.push(ele,st,n); 
                break; 
                case 2: 
                ob.pop(st); 
                break; 
                case 3: 
                System.out.println("Exit!"); 
                break; 
                default: 
                System.out.println("Invalid choice"); 
                } 
        }while(choice!=3); 
    } 
}