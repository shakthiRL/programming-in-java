import java.util.*;
public class yt8 {
    public static void main(String srgs[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the sal ");
        int sal=input.nextInt();
        System.out.println("enter the age ");
        int age=input.nextInt();

        if(sal>=20000 || age<=25){
        System.out.println("enter the loan ");
        int loan=input.nextInt();
        input.close();
            if (loan<50000){
                System.out.println("your eligible");
            }
            else if (loan>50000){
                System.out.println("max loan amm is 50000");
        }
        }
        else{
            System.out.println("no loan");
        }
    }
    
}
