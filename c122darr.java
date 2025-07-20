public class c122darr  {
    public static int sum(int n){
    if(n<10){
    return n;
}
return sum(n/10)+n%10;

    }

    public static int newsum(int m){
        if(m<10){
            return m;
        }
        return newsum(m/10)+m%10;
    }
public static void main(String[] args){
int n=679999999;
int m=sum(n);
System.out.println(newsum(m));
}

}


