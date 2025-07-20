import java.util.*;
public class yt16sq {
 public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("enter the n: ");
    int n = input.nextInt();
    int a[]=new int[n];
    for (int i=0;i<n;i++){
        a[i]=input.nextInt();
    }
    for (int i=0;i<n;i++){
        System.out.print(a[i]*a[i]);

 }   
input.close();
}
}
