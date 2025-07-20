public class yt22 {
    int passfail(int a){
        if(a>50){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
        return a;
    }
    public static void main(String[] args) {
        yt22 obj=new yt22();
        obj.passfail(60);
    }
}
