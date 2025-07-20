import java.util.Scanner;

public class bonous {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter sal");
        int sal=input.nextInt();
        System.out.println("enter joinyr");
        int yr=input.nextInt();
        input.close();

        int bon=(sal*5)/100;
        if(yr>5){
            System.out.println(bon+"  is the net amount");
        }
        else{
            System.out.println("not applicable");
        }
    }
    
}
