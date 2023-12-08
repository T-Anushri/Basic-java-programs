import java.util.*;
class Sorting{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        Arrays.sort(arr);
        int n=arr.length;
        int[] temp=new int[n];
        int i,j=0,k=n-1;
        for(i=0;i<n;i++)
        {
            if(i%2==0)
                temp[i]=arr[k--];
            else
                temp[i]=arr[j++];
        }
        for(i=0;i<n;i++)
            System.out.print(temp[i]+" ");
    }
}