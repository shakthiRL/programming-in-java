import java.util.*;

public class conditions {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("emter the name1");
        String name1 = input.nextLine();
        System.out.println("emter the name2");
        String name2 = input.nextLine();
        input.close();

//equals
        System.out.println("equals " +name1.equals(name2));    
//length
        System.out.println("length " +name1.length());    
//substring
        System.out.println("substring " +name1.substring(3,5));    
    }
    
}
