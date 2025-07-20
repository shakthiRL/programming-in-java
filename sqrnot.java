import java.util.Scanner;
public class sqrnot {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float l=input.nextInt();
        float b=input.nextInt();
        input.close();
        if(l==b){
            System.err.println("it is a sq");
        }
        else{
            System.out.println("it is rectangle ");
        }
    }
    
}
