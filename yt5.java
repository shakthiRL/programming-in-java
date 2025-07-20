import java.util.*;
public class yt5 {
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("enter the Score ");
    int score= input.nextInt();
    input.close();

    if(score<50){
        System.out.println("u need to improve");
    }    
    else if (score>=50 && score<=70){
        System.out.println("Good job");
    }
    else if (score>70){
        System.out.println("excelent");
    }
    
}
}