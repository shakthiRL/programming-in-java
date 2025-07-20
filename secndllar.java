import java.util.*;
public class secndllar {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the n");
        int n=input.nextInt();
        int first=Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;
        int[] arr=new int[n];
        for(int i=0;i<n;i=i+1){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<n;i=i+1){
            if(arr[i]>first){
                sec=first;
                first=arr[i];

            }
            else if(arr[i]>sec && arr[i]!=first){
                sec=arr[i];

            }
            
        }
        System.out.println(sec);
        input.close();
    }
    
}
