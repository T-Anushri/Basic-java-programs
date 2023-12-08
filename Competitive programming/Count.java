import java.util.HashMap;
import java.util.Scanner;
class Count{
    public static void main(String[] args){
        HashMap<Character, Integer> countchar = new HashMap<>();
        String str; 
        Scanner in = new Scanner(System.in);
        str = in.nextLine();
        char[] arr = str.toCharArray();
        for(char c : arr)
        {
            if(countchar.containsKey(c))
                countchar.put(c,countchar.get(c)+1);
            else
                countchar.put(c,1);
        }
        System.out.println(countchar);
    }
}