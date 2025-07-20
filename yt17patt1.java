import java.util.Scanner;

public class yt17patt1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the n : ");
        int a=input.nextInt();

        for (int i=0;i<a;i++){

            for(int j=0;j<=i;j++){
                System.out.print("@");
            }
                        System.out.println();

        }
input.close();
    }
}
