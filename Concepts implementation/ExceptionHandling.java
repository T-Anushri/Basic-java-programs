import java.util.*;
class UserDefined extends Exception{
    public UserDefined(String str){
        super(str);
    }
}
public class ExceptionHandling{
    static void check(int age)throws UserDefined{
        if(age<18){
            throw new UserDefined("Age is not valid to vote");
        }
        else{
            System.out.println("Age is valid to vote");
        }
    }
    public static void main(String[] args){
        try{
            check(13);
        }
        catch(UserDefined e){
            System.out.println("Caught the exception");
            System.out.println(e);
        }
        finally{
            System.out.println("Rest of the code!");
        }
    }
}