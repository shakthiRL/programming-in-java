import java.util.Scanner;

class hello{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int age = scan.nextInt();
        scan.close();


        System.out.println("my name is: "+name);
        System.out.println("my age is: "+age);
    }
}