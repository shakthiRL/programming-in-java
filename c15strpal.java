import java.util.Scanner;
public class c15strpal {
    public static String rev(String s) {
    if(s.length()==1){
        return s;
    }
    else{
        return rev(s.substring(1))+s.charAt(0);
    }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        System.out.println((rev(s)==s)?"pal":"not");
            input.close();









































            

    }
}

