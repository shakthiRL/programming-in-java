import java.util.Scanner;
public class rigpattern{
    int n;
    public static void main(String[] args){
       
        rigpattern obj = new rigpattern();
        obj.GetValue();
        obj.triangle();
    }
    void GetValue(){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the n: ");
        n=input.nextInt();
        input.close();

    }
    void triangle(){
        for(int index=n; index<=n; index--){
                      System.out.print("*");

           
           }
                      System.out.println();

        }
    }
