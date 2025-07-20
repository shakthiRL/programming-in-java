import java.util.*;
public class negativepositive {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        input.close();


        if (a<0){
            System.out.println(a+" is negative");
        }
        else if(a>0){
            System.out.println(a+" is positive");
        }
        else{
            System.out.println(a+" is zero");
        }
    }
}
