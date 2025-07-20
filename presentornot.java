import java.util.*;
public class presentornot {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the name ");
        String name = input.nextLine();
        input.close();

        System.out.println(name.contains("e"));

    }
    
}
