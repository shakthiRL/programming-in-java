import java.util.Scanner;

public class attendence {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("clsheld enter");
        int clsheld=input.nextInt();
        input.close();

        System.out.println("clsatt enter");
        int clsatt=input.nextInt();
        int att=clsatt/clsheld*(100);
        System.out.println(att+" attended per");
        if(att>75){
            System.out.println("allowed");
        }
        else{
            System.out.println("not Allowed");
        }

    }
    
}
