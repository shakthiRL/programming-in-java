public class c102darr {
public static void main(String[] args){
int n[][]={{1,1,0},
            {1,1,0},
            {1,1,1}};
             int max=0;
    for(int row=0;row<n.length;row++){     
        int count=0;   
    for(int col=0;col<n[row].length;col++){
    if(n[row][col]==1){
        count++;
    }
    if(count>max){
        max=count;
    }
}
}
System.out.print(max);
}
}

