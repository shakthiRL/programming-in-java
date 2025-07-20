import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        input.close();
        if(a!=0){

            if(a%2==0 ){
            System.out.println(a+ " is even");
        }
        else {
            System.out.println(a+" is odd");
        }
        }
        else{
            System.out.println(a+ " is Zero");
        }
        
    }
    
}
