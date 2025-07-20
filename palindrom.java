import java.util.*;
public class palindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the sum");
        int sum=input.nextInt();
        System.out.print("Enter the n ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        
        }
        input.close();
for (int i=0; i<n; i++){
        if((arr[i]+arr[i+1])==sum){
            i+=1;
            System.out.println("it is sum");
        }
}
    }}