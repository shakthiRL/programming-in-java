import java.util.Scanner;

public class c14strrev {
    public class pallindrome{
    public static String pal(String s) {
    if(s.length()==1){
        return s;
    }
    else{
        return pal(s.substring(1))+s.charAt(0);
    }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        System.out.println(pal(s));
            input.close();

    }
}
}
