import java.util.Scanner;

public class yt13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        input.close();
        for(int i=0;i<=n;i=i+1){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
