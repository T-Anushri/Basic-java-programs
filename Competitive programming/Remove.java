import java.util.*;
class Remove{
    public static void main(String[] args){
        int[] arr={1, 6, 9, 2, 11};
        ArrayList<Integer>list=new ArrayList<Integer>();
        for(int i=0;i<5;i++)
            list.add(arr[i]);
        list.removeIf(n->n<8);
        Collections.sort(list);
        System.out.println(list);
    }
}