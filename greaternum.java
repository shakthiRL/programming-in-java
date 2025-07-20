import java.util.Scanner;
public class greaternum{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        input.close();

        if(a>b){
            System.out.println(a+ " is greater");
        }
        else{
            System.out.println(b+ " is greater");
        }
    }
}