public class c72darr {
        public static void main(String[] args){
        int n=4;
        // int[][] arr=new int[n][n];
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                if (row==0||row==n-1||col==0||col==n-1) {
                    System.out.print(" * ");

                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();       
         }
    
}
}
