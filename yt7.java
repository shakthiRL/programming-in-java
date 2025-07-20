import java.util.*;
public class yt7 {
    public static void main(String args[]){
        Scanner input =new Scanner(System.in);
        System.out.println("enter the colore: ");
        String light = input.nextLine();
        input.close();

        if (light.equals("red") || light.equals("RED")){
            System.out.println("Stop");
        }
        else if(light.equals("YELLOW") || light.equals("yellow")){
            System.out.println("get ready");
        }
        else{
            System.out.println("GO");
        }

    }
    
}
