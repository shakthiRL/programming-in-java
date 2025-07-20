public class negposi {
    public static void main(String[] args){
        int arr[] ={1,2,3,4,5,-1,-2,-3,-4};
int poscount = 0;
int negcount=0;
        for(int i:arr){
            if(i<0){
                negcount++;
            }
            else if (i>0){
                poscount++;
            }

        }
        for(int i : arr){
            if(i%2==0){
                System.out.println(i);
            }
            else{
                System.out.println(i);
            }
        }
        System.out.println(negcount);
        System.out.println(poscount);
    }
}
