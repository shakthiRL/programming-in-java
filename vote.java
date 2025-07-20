import java.util.Scanner;

public class vote {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int age=input.nextInt();
        if(age>=18){
            System.out.println("eligile for voting");
            input.close();
        }
        else{
            System.out.println("not eligible for voting");
        }
    }
    
}
