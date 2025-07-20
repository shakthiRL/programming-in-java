import java.util.Scanner;
public class oldestamong3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int age_1=input.nextInt();
        int age_2=input.nextInt();
        int age_3=input.nextInt();
        input.close();
        
        if(age_1>age_2 && age_1>age_3){
            System.out.println(age_1+" is oldest");
            
        }
        else if(age_2>age_1 && age_2>age_3){
            System.out.println(age_2+" is oldest");
        }
        else{
            System.out.println(age_3+" is oldest");
        }
        if(age_1<age_2 && age_1<age_3){
            System.out.println(age_1+" is youngest");
            
        }
        else if(age_2<age_1 && age_2<age_3){
            System.out.println(age_2+" is Youngest");
        }
        else{
            System.out.println(age_3+" is youngest");
        }
    }
}
