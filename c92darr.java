public class c92darr {
    public static void main(String[] args){
        int n[][]={{4,6,2},
                    {9,8,1},
                    {3,3,4}};
for(int row=0;row<n.length;row++){
    int max=n[row][0];
    for(int col=0;col<n[row].length;col++){
        if(n[row][col]>max){
            max=n[row][col];
        }
    }
         System.out.println(max);

}
    }
}
