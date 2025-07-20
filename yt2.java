import java.util.*;
public class yt2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the num: ");
        int num = input.nextInt();
        input.close();

        if(num%3==0 && num%5==0){
            System.out.println("div by 3 and 5 ");
        }
        else if(num%3==0){
        System.out.println("num is div by 3");
    }
     else if (num%5==0){
            System.out.println("num is div by 5");
        }
        
        else{
            System.out.println("not div by 3 and 5");
        }
    }

    
}
