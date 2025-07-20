import java.util.*;

public class yt1{

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the income: ");
        int income = input.nextInt();
        input.close();

        if(income>7000){
            System.out.println("Scholarship available ");
        }
        else{
            System.out.println("Not available");
        }

    }

}