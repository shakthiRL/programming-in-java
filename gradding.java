import java.util.Scanner;
public class gradding {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int gre=input.nextInt();
        input.close();

        if(gre<25){
            System.out.println("F");
        }
        else if(gre>25 && gre<45){
            System.out.println("E");
        }
        else if(gre>45 && gre<50){
            System.out.println("D");
        }
        else if(gre>50 && gre<60){
            System.out.println("C");
    }
    else if(gre>60 && gre<80){
            System.out.println("B");}
    else if(gre>80) {
        System.out.println("A");
}
else {
            System.out.println("Ab");
}}
}
