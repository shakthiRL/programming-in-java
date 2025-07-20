import java.util.*;
public class yt6 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter m1");
        int m1=input.nextInt();
        System.out.println("enter m2");
        int m2=input.nextInt();
        System.out.println("enter m3");
        int m3=input.nextInt();
        System.out.println("enter m4");
        int m4=input.nextInt();
        System.out.println("enter m5");
        int m5=input.nextInt();
       input.close();

       int sum=m1+m2+m3+m4+m5;
       double avg= sum/5;
       if(avg<35){
        System.out.println("additional class is required");
       }
       else{
        System.out.println("you are good to go ");
       }

    }
    
}
